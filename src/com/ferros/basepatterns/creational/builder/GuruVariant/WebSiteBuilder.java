package com.ferros.basepatterns.creational.builder.GuruVariant;

public abstract class WebSiteBuilder {
    Website website;

    void createWebSite(){
        website=new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebsite(){
        return website;
    }
}
