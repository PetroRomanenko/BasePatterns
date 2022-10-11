package com.ferros.basepatterns.creational.abstractfactory.MyVariant2;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        Factory carFactory = new AbstractFactory().createFactory("Car");
        Factory tankFactory = new AbstractFactory().createFactory("Tank");

        Car toyota = carFactory.create("Toyota");
        toyota.drive();
        Car audi =  carFactory.create("Audi");
        audi.drive();

        Car t134 = tankFactory.create("T134");
        t134.drive();
    }
}
