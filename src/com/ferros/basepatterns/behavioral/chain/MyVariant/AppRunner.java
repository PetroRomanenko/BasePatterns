package com.ferros.basepatterns.behavioral.chain.MyVariant;

public class AppRunner {
    public static void main(String[] args) {
        NormalLevel normalLevel = new NormalLevel();
        AdvancedLevel advancedLevel= new AdvancedLevel();
        VIPLevel vipLevel = new VIPLevel();

        normalLevel.setNext(advancedLevel);
        advancedLevel.setNext(vipLevel);

        normalLevel.handleAction(new User(100,"text",1000),1000);
    }
}
