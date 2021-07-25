package Singleton;

public class Singleton {
    // static variable to store unique instance
    private static Singleton uniqueInstance;

    // other useful instance variables here

    // private constructor; only Singleton can create
    // instance of this class
    private Singleton() { }
    // method getInstance() create and return instance
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other methods
}
