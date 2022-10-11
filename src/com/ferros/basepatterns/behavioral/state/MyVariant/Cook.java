package com.ferros.basepatterns.behavioral.state.MyVariant;

public class Cook {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Sleeping){
            setActivity(new Breakfast());
        }else   if (activity instanceof Breakfast){
            setActivity(new Dinner());
        }else   if (activity instanceof Dinner){
            setActivity(new Supper());
        }else  if (activity instanceof Supper){
            setActivity(new CleaningPlates());
        }else  if (activity instanceof CleaningPlates){
            setActivity(new Sleeping());
        }
    }

    public void justDoIt(){
        activity.justDoIt();
    }
}
