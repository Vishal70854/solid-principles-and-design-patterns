package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.Employee;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        System.out.println("I am android developer");
        return "ANDROID DEVELOPER";
    }
}
