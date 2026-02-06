package design_patterns.creational.abstract_factory;

public class EmployeeFactory {

    // create employee
    public static Employee getEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();

    }
}
