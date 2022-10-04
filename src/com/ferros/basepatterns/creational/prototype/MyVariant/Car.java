package com.ferros.basepatterns.creational.prototype.MyVariant;

public class Car implements Coopyable {
    private int id;
    private String carName;
    private String plantProducer;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", projectName='" + carName + '\'' +
                ", sourceCode='" + plantProducer + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getPlantProducer() {
        return plantProducer;
    }

    public void setPlantProducer(String plantProducer) {
        this.plantProducer = plantProducer;
    }

    public Car(int id, String carName, String plantProducer) {
        this.id = id;
        this.carName = carName;
        this.plantProducer = plantProducer;
    }

    @Override
    public Object copy() {
        Car copy = new Car(id, carName, plantProducer);
        return copy;
    }
}
