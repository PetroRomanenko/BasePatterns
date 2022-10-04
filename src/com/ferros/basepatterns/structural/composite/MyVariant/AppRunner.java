package com.ferros.basepatterns.structural.composite.MyVariant;

public class AppRunner {
    public static void main(String[] args) {
        Department salesDepartment = new SalesDepartment(1, "Sales Department");
        Department financialDepartment  = new FinancialDepartment(1, "Financial Department ");
        HeadDepartment headDepartment = new HeadDepartment(1, "Financial department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();
    }
}
