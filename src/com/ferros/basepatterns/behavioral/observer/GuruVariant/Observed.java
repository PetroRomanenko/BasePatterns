package com.ferros.basepatterns.behavioral.observer.GuruVariant;

public interface Observed {
    public  void addObserver(Observer observer);
    public  void removeObserver(Observer observer);
    public void notifyObservers();
}
