package org.example.behavioral.observer.advance2;
public class ObserverExample {
    public static void main(String[] args) {
        // Tạo đối tượng SharedData dùng chung
        SharedData sharedData = new SharedData();

        // Tạo các observer
        Observer1 observer1 = new Observer1(sharedData);
        Observer2 observer2 = new Observer2(sharedData);
        Observer3 observer3 = new Observer3(sharedData);
        sharedData.addObserver(observer1);
        sharedData.addObserver(observer2);

        // Tạo subject
        ConcreteSubject subject = new ConcreteSubject();

        // Đăng ký các observer
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        // Gửi tin nhắn từ subject
        subject.notifyObservers("Hêy, Bắt đầu công việc nào 3 chú!");
    }
}
