package com.ferros.basepatterns.structural.decorator.MyVariant;

public class CarDecorator implements Car{
    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String run() {
        return car.run();
    }
}
