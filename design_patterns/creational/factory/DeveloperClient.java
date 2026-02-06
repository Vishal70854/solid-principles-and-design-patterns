package design_patterns.creational.factory;

public class DeveloperClient {
    public static void main(String[] args) {

        Employee employee1 = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        int salary1 = employee1.salary();
        System.out.println("Salary : " +salary1);


        Employee employee2 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        int salary2 = employee2.salary();
        System.out.println("Salary : " +salary2);

    }
}

/*
*
* Factory Desing Pattern
*
* When there is superclass and multiple subclass and we want to get object of subclass based on input and requirement
* Then we create a Factory class which takes the responsibility of creating object of class based on input
 */