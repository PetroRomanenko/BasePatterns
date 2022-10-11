package com.ferros.basepatterns.behavioral.strategy.MyVariant;

public class UsualMorningRunner {
    public static void main(String[] args) {
        Person person = new Person();

        person.setActivity(new GettingUp());
        person.executeActivity();

        person.setActivity(new CleaningTeath());
        person.executeActivity();

        person.setActivity(new MorningYoga());
        person.executeActivity();

        person.setActivity(new Shower());
        person.executeActivity();

        person.setActivity(new Breakfast());
        person.executeActivity();



    }
}
