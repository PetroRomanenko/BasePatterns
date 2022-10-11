package com.ferros.basepatterns.behavioral.command.GuruVariant;

public class Database {
    public void insert(){
        System.out.println("Inserting record....");
    }
    public  void update(){
        System.out.println("updating record....");
    }

    public void select(){
        System.out.println("Reading record...");
    }

    public void delete(){
        System.out.println("deleting record...");
    }
}
