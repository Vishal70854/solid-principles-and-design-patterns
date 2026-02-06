package design_patterns.creational.singleton;

public class Singleton {
    private static Singleton instance;
    // private constructor
    private Singleton() {
    }

    public static Singleton getSingleton(){
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}



/*
*
* 1. cosntructor private
* 2. object create with the help of static method
* 3. create field to store object which is private
 */