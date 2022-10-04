package com.ferros.basepatterns.creational.prototype.GuruVariant;

public class ProjectFactory {
    Project project;

    public void setProject(Project project) {
        this.project = project;
    }

    public ProjectFactory(Project project) {
        this.project = project;
    }
    Project cloneProject(){
        return (Project) project.copy();
    }
}
