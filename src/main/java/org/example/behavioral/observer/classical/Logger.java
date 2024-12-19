package org.example.behavioral.observer.classical;

public class Logger implements Observer {
    @Override
    public void update(User user) {
        System.out.println("Logger: " + user);
    }
}
