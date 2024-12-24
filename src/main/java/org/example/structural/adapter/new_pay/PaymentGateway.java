package org.example.structural.adapter.new_pay;
// phương thức thanh toán mới
public interface PaymentGateway {
    void pay(double amount, String userDetails);
}
