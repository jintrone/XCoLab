package org.xcolab.view.config.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.xcolab.client.StaticContestProposalContext;
import org.xcolab.client.comment.ICategoryClient;
import org.xcolab.client.comment.ICommentClient;
import org.xcolab.client.comment.IThreadClient;
import org.xcolab.client.comment.StaticCommentContext;
import org.xcolab.client.content.IContentClient;
import org.xcolab.client.content.IFileClient;
import org.xcolab.client.search.ISearchClient;
import org.xcolab.view.activityentry.discussion.DiscussionBaseActivityEntry;
import org.xcolab.view.pages.contestmanagement.wrappers.FlaggingReportWrapper;
import org.xcolab.view.pages.loginregister.ImageUploadUtils;
import org.xcolab.view.pages.profile.utils.ActivitySubscriptionNameGenerator;
import org.xcolab.view.pages.search.items.DiscussionSearchItem;
import org.xcolab.view.pages.search.paging.SearchDataPage;
import org.xcolab.view.taglibs.xcolab.jspTags.discussion.LoadThreadStartTag;
import org.xcolab.view.tags.LoadContentArticleTag;
import org.xcolab.view.util.entity.activityEntry.ActivitySubscriptionEmailHelper;

@Component
public class StaticInjector {

    @Autowired
    public StaticInjector(IFileClient fileClient, IContentClient contentClient,
            IThreadClient threadClient, ICommentClient commentClient,
            ICategoryClient categoryClient, ISearchClient searchClient) {
        // Module Internal
        ImageUploadUtils.setFileClient(fileClient);
        LoadContentArticleTag.setContentClient(contentClient);
        ActivitySubscriptionNameGenerator.setClients(categoryClient, threadClient);
        DiscussionBaseActivityEntry.setThreadClient(threadClient);
        LoadThreadStartTag.setThreadClient(threadClient);
        FlaggingReportWrapper.setClients(commentClient, threadClient);
        ActivitySubscriptionEmailHelper.setCommentClient(commentClient);
        DiscussionSearchItem.setClients(commentClient, threadClient);
        LoadThreadStartTag.setCategoryClient(categoryClient);
        SearchDataPage.setSearchClient(searchClient);

        // Module External
        StaticCommentContext.setClients(commentClient, categoryClient, threadClient);
        StaticContestProposalContext.setClients(commentClient, categoryClient, threadClient);
    }
}
