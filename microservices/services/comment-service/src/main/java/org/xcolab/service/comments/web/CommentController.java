package org.xcolab.service.comments.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.xcolab.client.comment.CommentClient;
import org.xcolab.client.comment.exceptions.CommentNotFoundException;
import org.xcolab.client.comment.pojo.IComment;
import org.xcolab.client.comment.pojo.IThread;
import org.xcolab.service.comments.domain.comment.CommentDao;
import org.xcolab.service.comments.domain.thread.ThreadDao;
import org.xcolab.service.comments.exceptions.NotFoundException;
import org.xcolab.service.utils.ControllerUtils;
import org.xcolab.service.utils.PaginationHelper;
import org.xcolab.util.http.exceptions.RuntimeEntityNotFoundException;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

@RestController
public class CommentController implements CommentClient {

    private final CommentDao commentDao;
    private final ThreadDao threadDao;

    @Autowired
    public CommentController(ThreadDao threadDao, CommentDao commentDao) {
        Assert.notNull(threadDao, "ThreadDao bean is required");
        Assert.notNull(commentDao, "CommentDao bean is required");
        this.threadDao = threadDao;
        this.commentDao = commentDao;
    }

    //TODO COLAB-2594: move /comments endpoint to "/threads/{threadId}/comments"
    @Override
    @RequestMapping(value = "/comments", method = {RequestMethod.GET, RequestMethod.HEAD})
    public List<IComment> listComments(HttpServletResponse response,
            @RequestParam(required = false) Integer startRecord,
            @RequestParam(required = false) Integer limitRecord,
            @RequestParam(required = false) String sort,
            @RequestParam(required = false) Long authorUserId,
            @RequestParam(required = false) List<Long> threadIds,
            @RequestParam(required = false, defaultValue = "false") Boolean includeDeleted) {
        PaginationHelper paginationHelper = new PaginationHelper(startRecord, limitRecord, sort);

        if (response != null) {
            response.setHeader(ControllerUtils.COUNT_HEADER_NAME,
                    Integer.toString(commentDao.countByGiven(authorUserId, threadIds)));
        }

        return commentDao.findByGiven(paginationHelper, authorUserId, threadIds, includeDeleted);
    }

    @Override
    @GetMapping("/comments/{commentId}")
    public IComment getComment(@PathVariable Long commentId,
            @RequestParam(required = false, defaultValue = "false") Boolean includeDeleted)
            throws CommentNotFoundException {
        IComment comment = null;
        try {
            comment = commentDao.get(commentId);
        } catch (NotFoundException e) {
            throw new CommentNotFoundException(commentId);
        }
        if (comment.getDeletedAt() == null || includeDeleted) {
            return comment;
        } else {
            throw new CommentNotFoundException(commentId);
        }
    }

    @Override
    @PostMapping("/comments")
    public IComment createComment(@RequestBody IComment comment) {
        comment.setCreatedAt(new Timestamp(new Date().getTime()));
        return commentDao.create(comment);
    }

    @Override
    @DeleteMapping("/comments/{commentId}")
    public boolean deleteComment(@PathVariable Long commentId) {
        try {
            IComment comment = commentDao.get(commentId);
            comment.setDeletedAt(new Timestamp(new Date().getTime()));
            //If last comment in thread, delete thread
            if (commentDao.countByGiven(null, Collections.singletonList(comment.getThreadId()))
                    == 1) {
                IThread thread = threadDao.get(comment.getThreadId());
                thread.setDeletedAt(new Timestamp(new Date().getTime()));
                threadDao.update(thread);
            }
            return commentDao.update(comment);
        } catch (NotFoundException e) {
            throw new RuntimeEntityNotFoundException("Comment not found with id " + commentId);
        }
    }

    @Override
    @PutMapping("/comments")
    public boolean updateComment(@RequestBody IComment comment) {
        try {
            commentDao.get(comment.getId());
        } catch (NotFoundException e) {
            throw new RuntimeEntityNotFoundException(
                    "Comment not found with id " + comment.getId());
        }
        comment.setUpdatedAt(new Timestamp(new Date().getTime()));
        return commentDao.update(comment);
    }
}
