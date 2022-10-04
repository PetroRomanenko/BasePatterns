package com.ferros.basepatterns.creational.abstractfactory.guruVariant.banking;

import com.ferros.basepatterns.creational.abstractfactory.guruVariant.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }
}
