package com.ferros.basepatterns.structural.bridge.MyVariant;

public class AppRunner {
    public static void main(String[] args) {
        Shape square = new Square(new Red());
        Shape triangle = new Triangle(new Blue());

        System.out.println( square.draw());
        System.out.println(  triangle.draw());
    }
}
