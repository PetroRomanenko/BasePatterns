package com.ferros.basepatterns.creational.builder.MyVariant;

public class BuildCarRunner {
    public static void main(String[] args) {
        CarBuilder builder = new SportCarBuilder();
        Director director = new Director(builder);
        Car car = director.manufactureCar();
        System.out.println("Below car delievered: ");
        System.out.println("======================================================================");
        System.out.println(car);
        System.out.println("======================================================================");

    }
}
