package com.ferros.basepatterns.creational.abstractfactory.MyVariant2;



public class AbstractFactory {
    public Factory createFactory(String type) {
        switch (type){
            case "Car" : return new CarFactory();
            case "Tank" : return new TankFactory();
            default: return null;
        }

    }
}
