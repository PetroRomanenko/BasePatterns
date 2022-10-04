package com.ferros.basepatterns.creational.builder.GuruVariant;

public class Director {
    WebSiteBuilder builder ;

    public void setBuilder( WebSiteBuilder builder){
        this.builder=builder;
    }

    Website buildWebsite(){
        builder.createWebSite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        Website website=builder.getWebsite();
        return website;
    }
}
