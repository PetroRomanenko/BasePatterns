package com.ferros.basepatterns.structural.decorator.MyVariant;

public class PickupCar extends CarDecorator{
    public PickupCar(Car car) {
        super(car);
    }

    public String carryCargo(){
        return "Carrying cargo....";
    }

    @Override
    public String run() {
        return super.run()+carryCargo();
    }
}
