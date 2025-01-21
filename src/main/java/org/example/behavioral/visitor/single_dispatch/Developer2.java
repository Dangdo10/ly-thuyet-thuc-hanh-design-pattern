package org.example.behavioral.visitor.single_dispatch;

public class Developer2 implements Customer {

    @Override
    public void buy(Book book) {
        if (book instanceof ProgramingBook) {
            ProgramingBook programingBook = (ProgramingBook) book;
            buy(programingBook);
        } else if (book instanceof BusinessBook) {
            BusinessBook businessBook = (BusinessBook) book;
            buy(businessBook);
        } else {
            System.out.println("Developer buy a Book");
        }
    }

    @Override
    public void buy(ProgramingBook book) {
        System.out.println("Developer buy a Programing Book");

    }

    @Override
    public void buy(BusinessBook book) {
        System.out.println("Developer buy a Business Book");
    }
}
