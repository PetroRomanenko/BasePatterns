package com.ferros.basepatterns.structural.adapter.MyVariant;

public class Application {
    public static void main(String[] args) {
        Runner runner = new Runner(new IceRoadAdapter());
        runner.runOnTheRoad();

    }
}
