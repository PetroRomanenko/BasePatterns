package com.ferros.basepatterns.structural.decorator.GuruVariant;

public class DeveloperDecorator implements Developer {
    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJava() {
        return developer.makeJava();
    }
}
