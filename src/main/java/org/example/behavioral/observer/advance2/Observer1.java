package org.example.behavioral.observer.advance2;
public class Observer1 implements Observer {

    private SharedData sharedData;

    public Observer1(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void update(String message) {
        System.out.println("================= Observer1 =================");
        System.out.println("Observer1 nhận được chỉ thị: " + "\"" + message + "\"");
        System.out.println("Observer đang làm ....");
        System.out.println("Observer đã làm xong.");
        sharedData.setMessage("Observer1 đã làm xong, tiếp tục đi observer2!", false);
    }

    @Override
    public void listen(String message) {
        System.out.println("================= Observer1 =================");
        System.out.println("Observer1 nhận được tin nhắn: " + message);
        sharedData.removeObserver(this);
        sharedData.setMessage("Observer1: Tuyệt vời!", true);
    }
}
