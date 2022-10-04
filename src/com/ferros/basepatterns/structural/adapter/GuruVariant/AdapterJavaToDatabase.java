package com.ferros.basepatterns.structural.adapter.GuruVariant;

public class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void insert() {
        savaObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
