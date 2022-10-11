package com.ferros.basepatterns.behavioral.visitor.GuruVariant;

public interface Developer {
    public void create(ProjectClass projectClass);
    public void create(Database database);
    public void create(Test test);
}
