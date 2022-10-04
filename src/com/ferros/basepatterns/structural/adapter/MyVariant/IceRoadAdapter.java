package com.ferros.basepatterns.structural.adapter.MyVariant;

public class IceRoadAdapter  implements Road{
    private IceRoad road;

    public IceRoadAdapter() {
        road= new IceRoad();
    }

    @Override
    public void run() {
        road.walk();
    }
}
