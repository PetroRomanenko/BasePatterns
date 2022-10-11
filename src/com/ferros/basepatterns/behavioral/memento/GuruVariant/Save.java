package com.ferros.basepatterns.behavioral.memento.GuruVariant;

import java.util.Date;

public class Save {
    private final String version;
    private final Date date;

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }

    public Save(String version) {
        this.version = version;
        this.date = new Date();
    }
}