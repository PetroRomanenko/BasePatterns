package com.ferros.basepatterns.structural.bridge.GuruVariant;

public abstract class Program {
    protected Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
