package design_patterns.creational.abstract_factory;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 10000;
    }

    @Override
    public String name() {
        System.out.println("I am web developer");
        return "WEB DEVELOPER";
    }
}
