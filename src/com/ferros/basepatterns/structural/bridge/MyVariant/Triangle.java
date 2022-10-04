package com.ferros.basepatterns.structural.bridge.MyVariant;

public class Triangle extends Shape{
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}
