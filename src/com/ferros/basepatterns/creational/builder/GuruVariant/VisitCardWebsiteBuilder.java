package com.ferros.basepatterns.creational.builder.GuruVariant;

public class VisitCardWebsiteBuilder extends WebSiteBuilder{
    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
