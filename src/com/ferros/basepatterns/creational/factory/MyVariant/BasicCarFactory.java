package com.ferros.basepatterns.creational.factory.MyVariant;

public class BasicCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new BasicCar();
    }
}
