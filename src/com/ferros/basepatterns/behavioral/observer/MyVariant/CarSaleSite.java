package com.ferros.basepatterns.behavioral.observer.MyVariant;

import java.util.ArrayList;
import java.util.List;

public class CarSaleSite implements Observed{
    List<String> carVariants = new ArrayList<>();
    List<Observer> subscribes = new ArrayList<>();

    public void addCarVariant(String carVariant){
        this.carVariants.add(carVariant);
        notifyObservers();
    }
    public void removeCarVariant(String carVariant){
        this.carVariants.remove(carVariant);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribes.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:subscribes){

            observer.handleEvent(this.carVariants);
        }

    }
}
