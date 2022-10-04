package com.ferros.basepatterns.creational.abstractfactory.guruVariant.webSite;

import com.ferros.basepatterns.creational.abstractfactory.guruVariant.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code");
    }
}
