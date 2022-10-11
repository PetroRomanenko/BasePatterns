package com.ferros.basepatterns.behavioral.mediator.GuruVariant;

public class Admin implements User{
    Chat chat;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Admin(Chat chat, String name) {System.out.println("Skills: ");
        this.chat = chat;
        this.name = name;
    }

    @Override
    public void sendMassage(String message) {
            chat.sendMessage(message,this);
    }

    @Override
    public void getMassage(String message) {
        System.out.println(this.name+" reciving message "
        +message+".");

    }
}
