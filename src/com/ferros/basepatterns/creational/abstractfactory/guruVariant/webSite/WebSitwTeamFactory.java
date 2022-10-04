package com.ferros.basepatterns.creational.abstractfactory.guruVariant.webSite;

import com.ferros.basepatterns.creational.abstractfactory.guruVariant.Developer;
import com.ferros.basepatterns.creational.abstractfactory.guruVariant.Manager;
import com.ferros.basepatterns.creational.abstractfactory.guruVariant.ProjectTeamFactory;
import com.ferros.basepatterns.creational.abstractfactory.guruVariant.Tester;

public class WebSitwTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new ProjectManager();
    }
}
