package com.ferros.basepatterns.behavioral.Iterator.GuruVariant;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skils = {"Java","Spring","Hibernate","Maven", "PostgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Petro Romanenko",skils);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: "+javaDeveloper.getName());
        System.out.println("Skills: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next().toString()+" ");
        }
    }
}
