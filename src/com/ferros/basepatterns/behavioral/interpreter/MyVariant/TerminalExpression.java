package com.ferros.basepatterns.behavioral.interpreter.MyVariant;

public class TerminalExpression implements Expression {
    private String data;
    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return  true;
        }

        return false;
    }

    public TerminalExpression(String data) {
        this.data = data;
    }
}
