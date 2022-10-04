package com.ferros.basepatterns.creational.abstractfactory.myvariant;

import com.ferros.basepatterns.creational.abstractfactory.myvariant.Yamaha.YamahaFactory;

public class Program {
    public static void main(String[] args) {
        CarsFactory factory;
        factory = new YamahaFactory();
        factory.createCoupe();
        factory.createSedan();
    }
}
