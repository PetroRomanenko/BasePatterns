package com.ferros.basepatterns.creational.prototype.MyVariant;

public class CarFactory {
    Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public CarFactory(Car car) {
        this.car = car;
    }
    Car cloneProject(){
        return (Car) car.copy();
    }
}
