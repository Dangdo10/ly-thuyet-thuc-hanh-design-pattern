package org.example.creational.singleton;

public class ThreadSafeLazyInitializedSingleton {
    private static volatile ThreadSafeLazyInitializedSingleton instance;

    private ThreadSafeLazyInitializedSingleton() {
    }

    public static synchronized ThreadSafeLazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyInitializedSingleton();
        }
        return instance;
    }

    public void display() {
        System.out.println("ThreadSafeLazyInitializedSingleton");
    }
}
