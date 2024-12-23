package org.example.behavioral.chain_of_responsibility.support;

class TechnicalSupport extends Support {
    @Override
    public void handleRequest(String request) {
        if (request.equals("technical issue")) {
            System.out.println("Technical Support: Solving technical issue");
        } else if (nextSupport != null) {
            nextSupport.handleRequest(request);
        }
    }
}
