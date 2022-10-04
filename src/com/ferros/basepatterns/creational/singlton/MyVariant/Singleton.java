package com.ferros.basepatterns.creational.singlton.MyVariant;

public class Singleton {
    private static Singleton instance;
    private Singleton(){

        System.out.println("Singleton created");
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

