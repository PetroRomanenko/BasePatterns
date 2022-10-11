package com.ferros.basepatterns.creational.abstractfactory.MyVariant2;

public class CarFactory implements Factory{
    public Car create(String carName){
        switch (carName){
            case "Audi": return new Audi();
            case "Toyota": return new Toyota();
            default: return null;
        }
    }


}
