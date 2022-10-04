package com.ferros.basepatterns.creational.builder.GuruVariant;

public class EnterpriseWebsiteBuilder extends WebSiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprise web site ");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);

    }

    @Override
    void buildPrice() {
        website.setPrice(1000);
    }
}
