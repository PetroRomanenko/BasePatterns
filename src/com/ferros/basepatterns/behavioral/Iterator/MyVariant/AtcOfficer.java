package com.ferros.basepatterns.behavioral.Iterator.MyVariant;

import java.util.ArrayList;
import java.util.List;

public class AtcOfficer implements Collection{
    private String name;
    private List<String> skills = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public AtcOfficer(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index<skills.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return skills.get(index++);
        }
    }
}
