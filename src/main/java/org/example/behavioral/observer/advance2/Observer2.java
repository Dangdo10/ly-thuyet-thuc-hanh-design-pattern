package org.example.behavioral.observer.advance2;

public class Observer2 implements Observer{
    private SharedData sharedData;

    public Observer2(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void update(String message) {
        System.out.println("========== Observer2 ==================");
        System.out.println("Observer2 nhận được chỉ thị: " + message);
        String sharedMessage = sharedData.getMessage();
        System.out.println("Observer2 thấy được tin nhắn: " + sharedMessage);
        System.out.println("Observer2 đang làm ....");
        System.out.println("Observer2 làm xong!");
        sharedData.removeObserver(this);
    }

    @Override
    public void listen(String message) {
        System.out.println("================= Observer2 =================");
        System.out.println("Observer2 received message: " + message);
        sharedData.setMessage(sharedData.getMessage(), true);
    }
}
