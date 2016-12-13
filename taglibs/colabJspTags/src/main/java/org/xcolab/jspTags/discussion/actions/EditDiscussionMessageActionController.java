package org.xcolab.jspTags.discussion.actions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.xcolab.client.admin.enums.ConfigurationAttributeKey;
import org.xcolab.client.comment.CommentClient;
import org.xcolab.client.comment.util.CommentClientUtil;
import org.xcolab.client.comment.exceptions.CommentNotFoundException;
import org.xcolab.client.comment.pojo.Comment;
import org.xcolab.client.contest.ContestClientUtil;
import org.xcolab.client.contest.exceptions.ContestNotFoundException;
import org.xcolab.client.contest.pojo.Contest;
import org.xcolab.jspTags.discussion.DiscussionPermissions;
import org.xcolab.jspTags.discussion.exceptions.DiscussionAuthorizationException;
import org.xcolab.util.clients.CoLabService;
import org.xcolab.util.html.HtmlUtil;
import org.xcolab.util.http.client.RefreshingRestService;
import org.xcolab.util.http.client.RestService;
import org.xcolab.entity.utils.LinkUtils;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

@Controller
@RequestMapping("view")
public class EditDiscussionMessageActionController extends BaseDiscussionsActionController {

    @RequestMapping(params = "action=editComment")
    public void handleAction(ActionRequest request, ActionResponse response,
            @RequestParam long commentId,
            @RequestParam("comment") String content,
            @RequestParam(value = "contestId", required = false) String contestId)
            throws IOException, DiscussionAuthorizationException, CommentNotFoundException {

        checkPermissions(request, "User isn't allowed to edit message", commentId);

        final CommentClient commentClient;

        if (contestId != null && !contestId.equals("")) {
            Long contestIdLong = Long.parseLong(contestId);
            Contest contest = null;
            try {
                contest = ContestClientUtil.getContest(contestIdLong);
            } catch (ContestNotFoundException ignored) {

            }
            if (contest != null && contest.getIsSharedContestInForeignColab()) {
                RestService commentsService = new RefreshingRestService(CoLabService.COMMENT,
                        ConfigurationAttributeKey.PARTNER_COLAB_LOCATION,
                        ConfigurationAttributeKey.PARTNER_COLAB_PORT);

                commentClient = CommentClient.fromService(commentsService);
            } else {
                commentClient = CommentClientUtil.getClient();
            }
        }else {
            commentClient = CommentClientUtil.getClient();
        }

        Comment comment = commentClient.getComment(commentId);
        comment.setContent(HtmlUtil.cleanSome(content, LinkUtils.getBaseUri(request)));
        commentClient.updateComment(comment);

        redirectToReferrer(request, response);
    }

    @Override
    public boolean isUserAllowed(DiscussionPermissions permissions, long additionalId)
            throws CommentNotFoundException {
        final Comment comment = CommentClientUtil.getComment(additionalId);
        return permissions.getCanAdminMessage(comment);
    }
}
