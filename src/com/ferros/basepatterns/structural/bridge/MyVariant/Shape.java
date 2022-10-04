package com.ferros.basepatterns.structural.bridge.MyVariant;

public abstract class Shape {
    public Shape(Color color) {
        this.color = color;
    }

    protected Color color;
    abstract public  String draw();
}
