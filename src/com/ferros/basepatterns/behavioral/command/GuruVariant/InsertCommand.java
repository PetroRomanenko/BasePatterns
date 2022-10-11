package com.ferros.basepatterns.behavioral.command.GuruVariant;

public class InsertCommand implements Command{
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();

    }
}
