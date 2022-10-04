package com.ferros.basepatterns.structural.decorator.MyVariant;

public class PassengerCar extends CarDecorator{
    public PassengerCar(Car car) {
        super(car);
    }

    @Override
    public String run() {
        return super.run() + transportPassengers();
    }

    public String transportPassengers(){
        return "Car Transport passengers....";
    }
}
