package org.example.behavioral.observer.advance2;

public class Observer3 implements Observer{

    private SharedData sharedData;

    public Observer3(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void update(String message) {
        System.out.println("========== Observer3 ==================");
        System.out.println("Observer3 nhận chỉ thị: " + message);
        System.out.println("Observer3 đang làm ...");
        System.out.println("Observer3 làm xong!");
        System.out.println("Observer3 nhập tin nhắn báo cáo và gửi đi >>>");
        sharedData.addObserver(this);
        sharedData.setMessage("\"Tôi Observer3 báo cáo:  Đã xử lý thành công mọi thứ!\"", true);


    }

    @Override
    public void listen(String message) {
        System.out.println("========== Observer3 ==================");
        System.out.println("Observer3 received message: " + message);


    }
}
