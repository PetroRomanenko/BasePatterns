package com.ferros.basepatterns.behavioral.memento.GuruVariant;

import java.util.Date;

public class Project {
    private String version;
    private Date date;

    @Override
    public String toString() {
        return "Project:\n" +
                "\nversion: " + version  +
                "\n Date=" + date+ "\n";
    }

    public void setVersionAndDate(String version){
        this.version=version;
        this.date= new Date();
    }
    public Save save(){
        return new Save(version);
    }

    public void load(Save save){
        version=save.getVersion();
        date=save.getDate();
    }
}
