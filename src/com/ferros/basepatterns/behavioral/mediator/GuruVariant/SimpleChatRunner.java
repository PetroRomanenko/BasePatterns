package com.ferros.basepatterns.behavioral.mediator.GuruVariant;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat =new SimpleTextChat();
        User admin = new Admin(chat,"Admin");
        User user1 = new SimpleUser(chat,"User 1");
        User user2 = new SimpleUser(chat,"User 2");
        User user3 = new SimpleUser(chat,"User 3");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        chat.addUserToChat(user3);

        user1.sendMassage("Hello, I am user 1");
        admin.sendMassage("Roger that, i am admin");

    }
}
