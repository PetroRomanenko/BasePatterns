package com.ferros.basepatterns.structural.adapter.GuruVariant;

public class DataBaseRunner {
    public static void main(String[] args) {
        Database database =new  AdapterJavaToDatabase();
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
