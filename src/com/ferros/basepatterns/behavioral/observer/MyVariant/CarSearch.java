package com.ferros.basepatterns.behavioral.observer.MyVariant;



public class CarSearch {
    public static void main(String[] args) {
        CarSaleSite carSite = new CarSaleSite();
        carSite.addCarVariant("Ford 2005, 10000$");
        carSite.addCarVariant("Niva 2015, 5000$");
        carSite.addCarVariant("Yamaha 2004, 3400$");

        Observer firstSubscriber = new Subscriber("Petro Romanenko");
        Observer secondSubscriber = new Subscriber("Vova Romanenko");

        carSite.addObserver(firstSubscriber);
        carSite.addObserver(secondSubscriber);

        carSite.addCarVariant("Audi 2019, 14000$");
        carSite.removeCarVariant("Niva 2015, 5000$");


    }
}
