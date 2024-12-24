package org.example.structural.adapter.new_pay;

// Phương thức thanh toán cũ của paypal
public class PayPalPaymentSystem {
    public void processPayment(double amount, String userId, String cardDetails) {
        System.out.println("Processing PayPal payment for " + userId + " with amount: " + amount);
    }
}
