package com.ferros.basepatterns.behavioral.visitor.GuruVariant;

public class Project implements ProjectElement{
    ProjectElement[] projectElements;

    public Project(){
        this.projectElements=new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }
    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement pe: projectElements){
            pe.beWritten(developer);
        }
    }
}
