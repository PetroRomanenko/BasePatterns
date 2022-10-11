package com.ferros.basepatterns.behavioral.memento.MyVariant;

public class MemetoRunner {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaken careTaken = new CareTaken();

        originator.setState("State 1");
        originator.setState("State 2");
        careTaken.add(originator.saveStateToMemento());

        originator.setState("State 3");
        careTaken.add(originator.saveStateToMemento());

        originator.setState("State 4");
        System.out.println("Current State: "+originator.getState());

        originator.getStateFromMemento(careTaken.get(0));
        System.out.println("First saved State: "+originator.getState());
        originator.getStateFromMemento(careTaken.get(1));
        System.out.println("Second State: " + originator.getState());

    }
}
