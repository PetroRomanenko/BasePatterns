package com.ferros.basepatterns.structural.bridge.GuruVariant;

public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program:programs ){
            program.developProgram();
        }

    }
}
