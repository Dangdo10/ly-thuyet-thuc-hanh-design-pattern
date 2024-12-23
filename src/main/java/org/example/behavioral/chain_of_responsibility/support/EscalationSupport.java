package org.example.behavioral.chain_of_responsibility.support;

class EscalationSupport extends Support {
    @Override
    public void handleRequest(String request) {
        System.out.println("Escalation Support: Handling complex issue");
    }
}
