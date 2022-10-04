package com.ferros.basepatterns.structural.proxy.GuruVariant;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/PetroRomanenko/TTICTAC");

        project.run();
    }

}
