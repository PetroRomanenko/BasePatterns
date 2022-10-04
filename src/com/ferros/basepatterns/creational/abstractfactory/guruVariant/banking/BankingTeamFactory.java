package com.ferros.basepatterns.creational.abstractfactory.guruVariant.banking;

import com.ferros.basepatterns.creational.abstractfactory.guruVariant.Developer;
import com.ferros.basepatterns.creational.abstractfactory.guruVariant.Manager;
import com.ferros.basepatterns.creational.abstractfactory.guruVariant.ProjectTeamFactory;
import com.ferros.basepatterns.creational.abstractfactory.guruVariant.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getManager() {
        return new BankingPM();
    }
}
