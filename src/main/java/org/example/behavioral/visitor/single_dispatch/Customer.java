package org.example.behavioral.visitor.single_dispatch;

public interface Customer {
    void buy(Book book);

    void buy(ProgramingBook book);

    void buy(BusinessBook book);
}
