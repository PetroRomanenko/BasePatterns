package com.ferros.basepatterns.behavioral.observer.MyVariant;

public interface Observed {
    public  void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

}
