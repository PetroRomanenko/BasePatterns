package com.ferros.basepatterns.structural.decorator.MyVariant;

public class AppRunner {
    public static void main(String[] args) {
        Car car = new PickupCar(new PassengerCar(new SimpleCar()));

        System.out.println(car.run());
    }
}
