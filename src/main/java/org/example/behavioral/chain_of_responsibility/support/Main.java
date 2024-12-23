package org.example.behavioral.chain_of_responsibility.support;

public class Main {
    public static void main(String[] args) {
        Support customerSupport = new CustomerSupport();
        Support technicalSupport = new TechnicalSupport();
        Support escalationSupport = new EscalationSupport();

        customerSupport.setNextSupport(technicalSupport);
        technicalSupport.setNextSupport(escalationSupport);

        // Khách hàng hỏi về giờ làm việc
        customerSupport.handleRequest("hours");

        // Khách hàng có vấn đề kỹ thuật
        customerSupport.handleRequest("technical issue");

        // Khách hàng yêu cầu hỗ trợ phức tạp
        customerSupport.handleRequest("complex issue");
    }
}
