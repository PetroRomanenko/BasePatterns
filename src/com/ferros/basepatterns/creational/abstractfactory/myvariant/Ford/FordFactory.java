package com.ferros.basepatterns.creational.abstractfactory.myvariant.Ford;

import com.ferros.basepatterns.creational.abstractfactory.myvariant.CarsFactory;
import com.ferros.basepatterns.creational.abstractfactory.myvariant.Coupe;
import com.ferros.basepatterns.creational.abstractfactory.myvariant.Sedan;

public class FordFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }
}
