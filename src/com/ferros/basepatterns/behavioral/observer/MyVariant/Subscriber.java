package com.ferros.basepatterns.behavioral.observer.MyVariant;

import java.util.List;

public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> carVariants) {
        System.out.println("Dear "+ name+
                "\nwe have some changes in car search list: \n"+
                carVariants+ "\n==================================");
    }
}
