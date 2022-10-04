package com.ferros.basepatterns.creational.abstractfactory.myvariant.Yamaha;

import com.ferros.basepatterns.creational.abstractfactory.myvariant.CarsFactory;
import com.ferros.basepatterns.creational.abstractfactory.myvariant.Coupe;
import com.ferros.basepatterns.creational.abstractfactory.myvariant.Sedan;

public class YamahaFactory implements CarsFactory {

    @Override
    public Sedan createSedan() {
        return new YamahaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new YamahaCoupe();
    }
}
