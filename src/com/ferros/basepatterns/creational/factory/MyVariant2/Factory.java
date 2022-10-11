package com.ferros.basepatterns.creational.factory.MyVariant2;

public class Factory {
    public  Car createCar(String carName){
        switch (carName){
            case "Audi": return new Audi();
            case "Toyota": return new Toyota();
            default: return null;
        }
    }
}
