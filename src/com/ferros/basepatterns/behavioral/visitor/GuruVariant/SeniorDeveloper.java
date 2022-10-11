package com.ferros.basepatterns.behavioral.visitor.GuruVariant;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewrites class after junior");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creates  reliable teats....");
    }
}
