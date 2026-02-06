package design_patterns.creational.abstract_factory;

public class Client {
    public static void main(String[] args) {


        // I want to get android developer
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        int salary1 = e1.salary();
        e1.name();
        System.out.println("Salary : " +salary1);



        // I want to get android developer
        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
        int salary2 = e2.salary();
        e2.name();
        System.out.println("Salary : " +salary2);


    }
}

/*
*
* Abstract Factory Design Pattern
 */