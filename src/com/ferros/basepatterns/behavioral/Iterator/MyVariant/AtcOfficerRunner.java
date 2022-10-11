package com.ferros.basepatterns.behavioral.Iterator.MyVariant;

import javax.imageio.ImageTranscoder;
import java.util.ArrayList;
import java.util.List;

public class AtcOfficerRunner {
    public static void main(String[] args) {

        List<String> skills = new ArrayList<>();
        skills.add("Indra");
        skills.add("English 5lvl");
        skills.add("Phraseology");
        skills.add("Simulator training");

        AtcOfficer atcOfficer = new AtcOfficer("Romanenko Petro",skills);

        Iterator iterator = atcOfficer.getIterator();

        System.out.println("ATC: "+atcOfficer.getName());
        System.out.println("Skills: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString()+" ");
        }
    }
}
