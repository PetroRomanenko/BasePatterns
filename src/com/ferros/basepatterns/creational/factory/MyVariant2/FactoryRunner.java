package com.ferros.basepatterns.creational.factory.MyVariant2;

public class FactoryRunner {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car toyota = factory.createCar("Toyota");
        Car audi = factory.createCar("Audi");

        toyota.drive();
        audi.drive();
    }
}
