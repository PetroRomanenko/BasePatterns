package com.ferros.basepatterns.structural.adapter.MyVariant;

public class Runner {
    private Road road;

    public Runner(){};

    public Runner(Road road){
        this.road=road;
    }

    public void runOnTheRoad(){
        System.out.println("Lets Run");
        road.run();
        System.out.println("Finish");
    }

}
