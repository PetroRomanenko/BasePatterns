package com.ferros.basepatterns.creational.abstractfactory.guruVariant.webSite;

import com.ferros.basepatterns.creational.abstractfactory.guruVariant.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website");
    }
}
