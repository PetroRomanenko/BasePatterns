package com.ferros.basepatterns.creational.factory.MyVariant;

public class LuxCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new LuxCar();
    }
}
