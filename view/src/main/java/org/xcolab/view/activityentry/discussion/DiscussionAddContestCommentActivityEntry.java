package org.xcolab.view.activityentry.discussion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.xcolab.view.i18n.ResourceMessageResolver;

@Component
public class DiscussionAddContestCommentActivityEntry extends DiscussionBaseActivityEntry {

    private static final String MESSAGE_CODE = "activities.discussion.discussionaddcontest.message";

    @Autowired
    public DiscussionAddContestCommentActivityEntry(
            ResourceMessageResolver resourceMessageResolver) {
        super(resourceMessageResolver);
    }

    @Override
    public Long getSecondaryType() {
        return DiscussionActivitySubType.DISCUSSION_CONTEST_COMMENT.getSecondaryTypeId();
    }

    @Override
    public String getBody() {
        String[] params = {getUserLink(), "Contest", getContestLink()};
        return resourceMessageResolver.getLocalizedMessage(MESSAGE_CODE, params);
    }

    @Override
    public String getTitle() {
        return getUserLink() + " added a comment to contest";
    }

    @Override
    public String getName() {
        return "Comment to contest";
    }
}
