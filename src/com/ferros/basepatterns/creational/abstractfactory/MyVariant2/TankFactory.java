package com.ferros.basepatterns.creational.abstractfactory.MyVariant2;

public class TankFactory implements Factory {
    @Override
    public Car create(String carName){
        switch (carName){
            case "T134": return (Car) new T134();
            case "Tiger": return (Car) new Tiger();
            default: return null;
        }
    }


}
