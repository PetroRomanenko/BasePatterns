package com.ferros.basepatterns.creational.abstractfactory.guruVariant;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    Manager getManager();
}
