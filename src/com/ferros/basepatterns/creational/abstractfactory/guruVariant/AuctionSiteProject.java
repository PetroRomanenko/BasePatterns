package com.ferros.basepatterns.creational.abstractfactory.guruVariant;

import com.ferros.basepatterns.creational.abstractfactory.guruVariant.webSite.WebSitwTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory =new WebSitwTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester= projectTeamFactory.getTester();
        Manager manager= projectTeamFactory.getManager();

        System.out.println("Creating auction web site....");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
