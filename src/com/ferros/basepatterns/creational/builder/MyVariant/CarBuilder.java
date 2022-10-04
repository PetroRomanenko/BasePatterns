package com.ferros.basepatterns.creational.builder.MyVariant;

public interface CarBuilder {
    public CarBuilder fixChassis();
    public CarBuilder fixBody();
    CarBuilder paint();
    CarBuilder fixInterior();
    Car build();
}
