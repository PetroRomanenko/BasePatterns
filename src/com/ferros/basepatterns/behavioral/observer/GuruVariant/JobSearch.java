package com.ferros.basepatterns.behavioral.observer.GuruVariant;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("first java position");
        jobSite.addVacancy("second java position");

        Observer firstSubscriber = new Subscriber("Petro Romanenko");
        Observer secondSubscriber = new Subscriber("Vova Romanenko");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third java position");

        jobSite.removeVacancy("first java position");
    }
}
