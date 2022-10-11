package com.ferros.basepatterns.behavioral.mediator.GuruVariant;

public class SimpleUser implements User{
    Chat chat;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    @Override
    public void sendMassage(String message) {
        chat.sendMessage(message,this);

    }

    @Override
    public void getMassage(String message) {
        System.out.println(this.name+" receiving massage "+message+".");

    }
}
