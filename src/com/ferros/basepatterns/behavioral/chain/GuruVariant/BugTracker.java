package com.ferros.basepatterns.behavioral.chain.GuruVariant;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier1 = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier3 = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier1);
        emailNotifier1.setNextNotifier(smsNotifier3);

        reportNotifier.notifyManager("Everything is ok", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong", Priority.IMPORTANT);
        reportNotifier.notifyManager("Houston, we`ve had a problem`", Priority.ASAP);
    }
}
