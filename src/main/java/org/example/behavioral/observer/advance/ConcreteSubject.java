package org.example.behavioral.observer.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcreteSubject implements Subject {
    private ExecutorService executor;                           // C2 run bất đồng bộ
    private List<Observer> observers = new ArrayList<>();

    public ConcreteSubject() {                                  // C2 run bất đồng bộ
        // Tạo một thread pool với số lượng luồng nhất định     // C2 run bất đồng bộ
        executor = Executors.newCachedThreadPool();             // C2 run bất đồng bộ
    }                                                           // C2 run bất đồng bộ

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            //observer.update(message);                                     // Không chạy bất đồng bộ
            //CompletableFuture.runAsync(() -> observer.update(message));   // C1 run bất đồng bộ
            executor.submit(() -> observer.update(message));              // C2 run bất đồng bộ
        }
    }

    public void shutdown() {                                            // C2 run bất đồng bộ
        executor.shutdown();                                            // C2 run bất đồng bộ
    }                                                                   // C2 run bất đồng bộ
}
