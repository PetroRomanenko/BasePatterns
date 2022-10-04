package com.ferros.basepatterns.structural.bridge.MyVariant;

public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn..."+color.fill();
    }
}
