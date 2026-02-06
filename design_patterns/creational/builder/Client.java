package design_patterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        // create object using builder
        User user = new User.UserBuilder()
                .setUserId("123")
                .setUserName("Vishal")
                .setEmailId("vishal@gmail.com")
                .build();

        System.out.println(user);

        // we can create as many objects using  builder
        // order of setting values does not matter
        // we create object based on user input types i.e if user wants to give only userId and userName or only userId and emailId
        // then object can be created with 1 or 2 or n number of values

        User user2 = new User.UserBuilder()
                .setUserId("456")
                .setUserName("Ankit")
                .setEmailId("ankit@gmail.com")
                .build();

        System.out.println(user2);
    }
}

/*
* Builder Design Pattern
*
* While creating object when object contain many attributes there are many problem exists:
* 1. we have to pass many arguments to create object
* 2. some parameters might be optional
* 3. factory class takes all responsibility for creating object, if the object is heavy then all complexity is the part of factory class
*
* so in builder pattern we create object step by step and finally return final object with desired values of attributes.
* Builder pattern is used to create immutable objects
*
 */