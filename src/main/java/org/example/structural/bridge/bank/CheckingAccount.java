package org.example.structural.bridge.bank;

public class CheckingAccount implements Account {

    @Override
    public void openAccount() {
        System.out.println("Checking Account");
    }
}