package com.ferros.basepatterns.creational.abstractfactory.guruVariant.banking;

import com.ferros.basepatterns.creational.abstractfactory.guruVariant.Manager;

public class BankingPM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project");
    }
}
