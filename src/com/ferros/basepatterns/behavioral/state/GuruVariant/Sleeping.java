package com.ferros.basepatterns.behavioral.state.GuruVariant;

public class Sleeping implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("I am sleeping at night");
    }
}
