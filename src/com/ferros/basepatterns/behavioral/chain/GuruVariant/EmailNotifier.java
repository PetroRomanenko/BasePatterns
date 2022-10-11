package com.ferros.basepatterns.behavioral.chain.GuruVariant;

public class EmailNotifier extends Notifier{
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: "+message);

    }
}
