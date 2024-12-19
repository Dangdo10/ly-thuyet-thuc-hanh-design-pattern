package org.example.behavioral.observer.advance;

public class ObserverExample {
    public static void main(String[] args) {
        // Tạo đối tượng SharedData dùng chung
        SharedData sharedData = new SharedData();

        // Tạo các observer
        Observer1 observer1 = new Observer1(sharedData);
        Observer2 observer2 = new Observer2(sharedData);

        // Tạo subject
        ConcreteSubject subject = new ConcreteSubject();

        // Đăng ký các observer
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Gửi tin nhắn từ subject
        subject.notifyObservers("Hello from Subject!");
    }
}
