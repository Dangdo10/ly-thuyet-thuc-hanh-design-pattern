package org.example.structural.adapter.new_pay;

public class PaymentClient {
    public static void main(String[] args) {
        // Tạo đối tượng PayPalPaymentSystem cũ
        PayPalPaymentSystem payPalPaymentSystem = new PayPalPaymentSystem();

        // Tạo đối tượng adapter
        PaymentGateway paymentGateway = new PayPalAdapter(payPalPaymentSystem);

        // Sử dụng adapter để thực hiện thanh toán với PayPal
        paymentGateway.pay(100.0, "user123");
    }
}
