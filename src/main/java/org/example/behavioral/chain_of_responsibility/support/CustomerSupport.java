package org.example.behavioral.chain_of_responsibility.support;

class CustomerSupport extends Support {
    @Override
    public void handleRequest(String request) {
        if (request.equals("hours")) {
            System.out.println("Customer Support: Providing business hours");
        } else if (nextSupport != null) {
            nextSupport.handleRequest(request);
        }
    }
}
