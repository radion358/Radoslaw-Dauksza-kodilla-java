package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

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
    }
}
