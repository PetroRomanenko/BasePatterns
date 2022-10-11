package com.ferros.basepatterns.behavioral.mediator.MyVariant;

public class MediatorRunner {
    public static void main(String[] args) {
        ChatRoom chat = new ChatRoomImpl();
        User user1 = new User1(chat);

        user1.setName("Petro");

        user1.sendMessage("Hi how are you");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ChatRoom chat1 = new ChatRoomImpl();
        User user2 = new User2(chat1);
        user2.setName("Vova");
        user2.sendMessage("I am fine thanks");
    }
}
