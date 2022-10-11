package com.ferros.basepatterns.behavioral.chain.MyVariant;

public class AdvancedLevel extends LevelHandler{

    private static final int  needPoint=5000;

    @Override
    public void handleAction(User user, int point) {
        if (user.getUserPoint()+point>needPoint){
            getNext().handleAction(user,point);
        }else {
            //трам пам пам
        }
    }
}
