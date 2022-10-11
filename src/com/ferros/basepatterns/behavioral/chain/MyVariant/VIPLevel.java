package com.ferros.basepatterns.behavioral.chain.MyVariant;

public class VIPLevel extends LevelHandler{

    private static final int  needPoint=10000;

    @Override
    public void handleAction(User user, int point) {
        System.out.println("Vip...");
            //трам пам пам
        }
    }

