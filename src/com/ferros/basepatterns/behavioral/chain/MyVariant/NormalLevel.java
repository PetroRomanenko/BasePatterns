package com.ferros.basepatterns.behavioral.chain.MyVariant;

public class NormalLevel extends LevelHandler{

    private static final int  needPoint=1000;

    @Override
    public void handleAction(User user, int point) {
        if (user.getUserPoint()+point>needPoint){
            getNext().handleAction(user,point);
        }else {
            //трам пам пам
        }
    }
}
