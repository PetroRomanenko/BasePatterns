package com.ferros.basepatterns.creational.builder.GuruVariant;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director= new Director();

        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website website= director.buildWebsite();

        System.out.println(website);
    }
}
