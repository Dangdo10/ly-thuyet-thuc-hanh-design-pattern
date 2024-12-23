package org.example.behavioral.chain_of_responsibility.support;

public abstract class Support {
    protected Support nextSupport;

    public void setNextSupport(Support nextSupport) {
        this.nextSupport = nextSupport;
    }

    public abstract void handleRequest(String request);
}
