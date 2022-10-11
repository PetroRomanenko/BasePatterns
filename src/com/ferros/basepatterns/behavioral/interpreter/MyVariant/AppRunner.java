package com.ferros.basepatterns.behavioral.interpreter.MyVariant;
import java.util.regex.PatternSyntaxException;
public class AppRunner {
    public static void main(String[] args) {
        Expression isCar =getCarExpression();
        Expression isOfRoadCar = getCarOfRoadExpression();

        System.out.println("Dose car can use simple road: "+isCar.interpret("Simple Car"));
        System.out.println("Dose car can use of of road: "+isOfRoadCar.interpret("Of road Car"));


    }


    public static Expression getCarExpression(){
        Expression car = new TerminalExpression("Car");
        Expression carSimple = new TerminalExpression("Simple Car");
        return new OrExpression(car,carSimple);
    }

    public static Expression getCarOfRoadExpression(){
        Expression car = new TerminalExpression("Car");
        Expression carSimple = new TerminalExpression("Of road");
        return new AndExpression(car,carSimple);
    }
}
