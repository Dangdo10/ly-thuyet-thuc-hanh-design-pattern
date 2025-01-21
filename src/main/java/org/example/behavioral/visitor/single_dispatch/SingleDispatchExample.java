package org.example.behavioral.visitor.single_dispatch;

public class SingleDispatchExample {
    public static void main(String[] args) {
        Book book = new ProgramingBook(); // (1)
        Customer gpcoder = new Developer();
        gpcoder.buy(book);

        Customer gpcoder2 = new Developer2();
        gpcoder2.buy(book);

        ProgramingBook programingBook = new ProgramingBook(); // (2)
        gpcoder.buy(programingBook); // Developer buy a Programing Book
    }
}
