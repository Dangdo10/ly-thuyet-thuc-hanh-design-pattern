package org.example.behavioral.observer.advance;

public class Observer1 implements Observer {
    private SharedData sharedData;

    public Observer1(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void update(String message) {
        // Lưu tin nhắn vào SharedData
        sharedData.setMessage("Hello observer2, this is message from observer1!");
        System.out.println("Observer1 received message: " + message);
    }
}
