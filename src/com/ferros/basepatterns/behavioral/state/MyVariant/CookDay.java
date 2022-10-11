package com.ferros.basepatterns.behavioral.state.MyVariant;

public class CookDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Cook cook = new Cook();

        cook.setActivity(activity);

        for (int i=0;i<20;i++){
            cook.justDoIt();
            cook.changeActivity();//
        }
    }
}
