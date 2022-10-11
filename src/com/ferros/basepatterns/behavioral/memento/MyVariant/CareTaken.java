package com.ferros.basepatterns.behavioral.memento.MyVariant;

import java.util.ArrayList;
import java.util.List;

public class CareTaken {
    private List<Memento> mementoList= new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}