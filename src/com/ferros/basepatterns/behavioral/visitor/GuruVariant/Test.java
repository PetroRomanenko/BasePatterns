package com.ferros.basepatterns.behavioral.visitor.GuruVariant;



public class Test implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
