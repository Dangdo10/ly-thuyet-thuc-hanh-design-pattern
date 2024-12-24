package org.example.structural.adapter.new_pay;

// adapter tích hợp phương thức thanh toán cũ của paypal
public class PayPalAdapter  implements PaymentGateway {
    private PayPalPaymentSystem payPalPaymentSystem;

    public PayPalAdapter(PayPalPaymentSystem payPalPaymentSystem) {
        this.payPalPaymentSystem = payPalPaymentSystem;
    }

    @Override
    public void pay(double amount, String userDetails) {
        // Tạo thông tin chi tiết thẻ từ thông tin người dùng và gọi phương thức của PayPal
        String cardDetails = "card_" + userDetails; // Giả sử chi tiết thẻ là một phần của thông tin người dùng
        payPalPaymentSystem.processPayment(amount, userDetails, cardDetails);
    }
}