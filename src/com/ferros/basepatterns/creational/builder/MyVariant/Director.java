package com.ferros.basepatterns.creational.builder.MyVariant;

public class Director {
    private CarBuilder builder;

    public Director(CarBuilder builder){
        this.builder=builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Director can't work without Car Builder!");
        }
    }

    public Car manufactureCar(){
        return builder.fixChassis().fixBody().fixInterior().paint().build();
    }
}
