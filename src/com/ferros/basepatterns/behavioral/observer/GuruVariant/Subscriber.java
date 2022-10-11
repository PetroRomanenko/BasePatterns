package com.ferros.basepatterns.behavioral.observer.GuruVariant;

import java.util.List;

public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear "+name+"\nwe have some changes in vacancies:\n"+vacancies
        +"\n=================================================");

    }
}
