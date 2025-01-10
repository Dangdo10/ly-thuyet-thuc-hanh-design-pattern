package org.example.structural.bridge.bank;

public class SavingAccount implements Account {

    @Override
    public void openAccount() {
        System.out.println("Saving Account");
    }
}