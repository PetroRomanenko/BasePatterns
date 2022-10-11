package com.ferros.basepatterns.creational.prototype.GuruVariant;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "Super project", "Source code = new SourñeCode();");
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        System.out.println("++++++++++++++++++++++++++++");
        System.out.println(masterClone);
    }
}
