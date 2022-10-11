package com.ferros.basepatterns.behavioral.chain.MyVariant;

public abstract class LevelHandler {
    protected LevelHandler next;

    public LevelHandler getNext(){
        return next;
    }

    public void setNext(LevelHandler next) {
        this.next = next;
    }

    public abstract void handleAction(User user, int point);
}
