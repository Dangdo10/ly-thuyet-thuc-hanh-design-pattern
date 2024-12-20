package org.example.behavioral.observer.advance2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class SharedData {
    private String message;
    private final List<Observer> observers = new ArrayList<>();
    private final ReentrantLock lock = new ReentrantLock();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setMessage(String message, boolean sentAll) {
        lock.lock();
        try {
            this.message = message;
            if (sentAll) {
                // Thông báo cho tất cả observers về sự thay đổi
                for (Observer observer : observers) {
                    observer.listen(message);
                }
            }

        } finally {
            lock.unlock();
        }
    }

    public String getMessage() {
        lock.lock();
        try {
            return message;
        } finally {
            lock.unlock();
        }
    }
}
