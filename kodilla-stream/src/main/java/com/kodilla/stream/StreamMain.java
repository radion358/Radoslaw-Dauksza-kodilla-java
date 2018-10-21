package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier beautifier = new PoemBeautifier();

        beautifier.beautify("Lubię placki.", poem -> "ABC " + poem + " ABC" );
        System.out.println();
        beautifier.beautify("Lubię placki.", poem -> poem.toUpperCase());
        System.out.println();
        beautifier.beautify("Lubię placki.", poem -> poem.replaceFirst(" ", "\n"));
        System.out.println();
        beautifier.beautify("Lubię placki.", poem -> poem.replaceFirst("placki", "ser"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
