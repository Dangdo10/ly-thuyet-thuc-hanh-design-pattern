package org.example.behavioral.observer.classical;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyAllObserver();
}
