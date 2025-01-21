package org.example.behavioral.visitor.book;

public interface Book {
    void accept(Visitor v);
}
