package com.ferros.basepatterns.behavioral.strategy.GuruVariant;

public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.justDoIt();
    }
}
