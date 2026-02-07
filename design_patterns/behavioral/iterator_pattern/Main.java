package design_patterns.behavioral.iterator_pattern;

public class Main {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();

        userManagement.addUser(new User("Vishal","12"));
        userManagement.addUser(new User("Rahul","96"));
        userManagement.addUser(new User("Manoj","45"));
        userManagement.addUser(new User("Gaurav","2"));

        MyIterator iterator = userManagement.getIterator();

        while(iterator.hasNext()){
            User user = (User) iterator.next();
            System.out.println(user);
        }

    }
}

/*
* Iterator Design Pattern
* The iterator pattern provides a way to access the elements of an object without exposing its underlying implementation.
 */
