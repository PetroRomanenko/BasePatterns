package com.ferros.basepatterns.behavioral.mediator.MyVariant;

public class User1 extends User{
    private String name;
    private ChatRoom chat;
    @Override
    public void sendMessage(String message) {
        chat.showMessage(message,this);
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }
    public User1(ChatRoom chat){
        this.chat=chat;
    }
}
