package com.ferros.basepatterns.creational.abstractfactory.guruVariant.webSite;

import com.ferros.basepatterns.creational.abstractfactory.guruVariant.Manager;

public class ProjectManager implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website");
    }
}
