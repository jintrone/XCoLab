package org.xcolab.view.config.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import org.xcolab.client.admin.AdminClient;
import org.xcolab.client.admin.ContestTypeClient;
import org.xcolab.client.admin.EmailTemplateClient;
import org.xcolab.client.admin.StaticAdminContext;
import org.xcolab.client.content.IContentClient;
import org.xcolab.client.content.IFileClient;
import org.xcolab.client.modeling.IModelingClient;
import org.xcolab.client.search.ISearchClient;
import org.xcolab.view.pages.loginregister.ImageUploadUtils;
import org.xcolab.view.pages.search.paging.SearchDataPage;
import org.xcolab.view.pages.modeling.admin.form.UpdateModelInputWidgetsBean;
import org.xcolab.view.tags.LoadContentArticleTag;

@Component
public class StaticInjector implements ApplicationRunner {

    @Autowired
    private ISearchClient searchClient;

    @Autowired
    private IFileClient fileClient;

    @Autowired
    private IContentClient contentClient;

    @Autowired
    private IModelingClient modelingClient;

    @Autowired
    private AdminClient adminClient;

    @Autowired
    private ContestTypeClient contestTypeClient;

    @Autowired
    private EmailTemplateClient emailTemplateClient;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        SearchDataPage.setSearchClient(searchClient);
        ImageUploadUtils.setFileClient(fileClient);
        LoadContentArticleTag.setContentClient(contentClient);
        UpdateModelInputWidgetsBean.setModelingClient(modelingClient);

        StaticAdminContext.setClients(adminClient, contestTypeClient, emailTemplateClient);
    }
}
