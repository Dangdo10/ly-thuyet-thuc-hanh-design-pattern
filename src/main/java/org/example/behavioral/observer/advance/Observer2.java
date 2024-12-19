package org.example.behavioral.observer.advance;

public class Observer2 implements Observer {
    private SharedData sharedData;

    public Observer2(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void update(String message) {
        // Observer2 nhận tin nhắn và làm gì đó
        System.out.println("Observer2 received message: " + message);

        // Giả sử Observer2 muốn "lắng nghe" và chia sẻ thông tin
        // với Observer1, nó có thể truy cập SharedData.
        //sharedData.setMessage("Ghi đè");
        String sharedMessage = sharedData.getMessage();
        System.out.println("Observer2 sees the shared message: " + sharedMessage);
    }
}