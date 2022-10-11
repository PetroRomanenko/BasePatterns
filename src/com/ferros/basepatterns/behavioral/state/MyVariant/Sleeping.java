package com.ferros.basepatterns.behavioral.state.MyVariant;

public class Sleeping implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Sleeping, at last....");
    }
}
