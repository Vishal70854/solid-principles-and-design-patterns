package design_patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        // create and get singleton object
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1.hashCode());


        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2.hashCode());
    }
}
