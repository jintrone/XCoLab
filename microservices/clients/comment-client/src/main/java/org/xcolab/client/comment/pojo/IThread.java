package org.xcolab.client.comment.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import org.xcolab.client.comment.StaticInjectorComment;
import org.xcolab.client.comment.exceptions.CategoryNotFoundException;
import org.xcolab.client.comment.exceptions.KeyReferenceException;
import org.xcolab.client.comment.pojo.tables.pojos.Thread;
import org.xcolab.client.members.MembersClient;
import org.xcolab.client.members.exceptions.MemberNotFoundException;
import org.xcolab.client.members.pojo.Member;
import org.xcolab.commons.time.DurationFormatter;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@JsonDeserialize(as = Thread.class)
public interface IThread {

    Long getId();

    void setId(Long id);

    Long getCategoryId();

    void setCategoryId(Long categoryId);

    Long getAuthorUserId();

    void setAuthorUserId(Long authorUserId);

    String getTitle();

    void setTitle(String title);

    Timestamp getCreatedAt();

    void setCreatedAt(Timestamp createdAt);

    Timestamp getDeletedAt();

    void setDeletedAt(Timestamp deletedAt);

    Boolean getIsQuiet();

    void setIsQuiet(Boolean isQuiet);

    default int getCommentsCount() {
        return StaticInjectorComment.getCommentClient().countComments(getId());
    }

    @JsonIgnore
    default List<IComment> getComments() {
        return StaticInjectorComment.getCommentClient().listComments(0, Integer.MAX_VALUE, getId());
    }

    @JsonIgnore
    default long getLastActivityAuthorUserId() {
        return StaticInjectorComment.getThreadClient().getLastActivityAuthorUserId(getId());
    }

    @JsonIgnore
    default Member getLastActivityAuthor() {
        try {
            return MembersClient.getMember(getLastActivityAuthorUserId());
        } catch (MemberNotFoundException e) {
            throw new KeyReferenceException(e);
        }
    }

    @JsonIgnore
    default Date getLastActivityDate() {
        return StaticInjectorComment.getThreadClient().getLastActivityDate(getId());
    }

    @JsonIgnore
    default String getLastActivityDateFormatted() {
        return DurationFormatter.forRequestLocale().format(getLastActivityDate());
    }

    @JsonIgnore
    default Member getAuthor() {
        try {
            return MembersClient.getMember(getAuthorUserId());
        } catch (MemberNotFoundException e) {
            throw new KeyReferenceException(e);
        }
    }

    @JsonIgnore
    default ICategory getCategory() {
        final Long categoryId = getCategoryId();
        if (categoryId != null && categoryId > 0) {
            try {
                return StaticInjectorComment.getCategoryClient().getCategory(categoryId);
            } catch (CategoryNotFoundException ignored) {
                //throw new KeyReferenceException(e);
            }
        }
        return null;
    }

    @JsonIgnore
    default String getLinkUrl() {
        final ICategory category = getCategory();
        if (category != null) {
            final ICategoryGroup categoryGroup = category.getCategoryGroup();
            if (categoryGroup != null) {
                return categoryGroup.getLinkUrl() + "/thread/" + getId();
            }
        }
        //TODO COLAB-2592: handle proposal comments
        return null;
    }
}
