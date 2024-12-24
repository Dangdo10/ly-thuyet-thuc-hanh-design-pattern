package org.example.structural.adapter.translation;

public class JapaneseAdaptee {
    public void receive(String words) {
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(words);
    }
}
