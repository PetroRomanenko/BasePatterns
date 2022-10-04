package com.ferros.basepatterns.creational.prototype.MyVariant;

public class CarProduserRunner {
    public static void main(String[] args) {
        Car master = new Car(1, "Super Car", "FordManufacture");
        System.out.println(master);

        CarFactory factory = new CarFactory(master);
        Car masterClone=factory.cloneProject();
        masterClone.setCarName("Batman car");

        System.out.println("++++++++++++++++++++++++++++");
        System.out.println(masterClone);
    }
}
