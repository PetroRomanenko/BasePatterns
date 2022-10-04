package com.ferros.basepatterns.structural.facade.MyVariant;

import javax.swing.*;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle is draw");
    }
}
