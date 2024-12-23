package org.example.creational.prototype.computer;

public class ITApp {

    public static void main(String[] args) {
        Computer computer1 = new Computer(
                "Window10", "Word", "Bkav",
                "Chrome", "Skype");
        Computer computer2 = computer1.clone();
        computer2.setOthers("Eclipse, Facebook");
        System.out.println(computer1);
        System.out.println(computer2);
    }
}
