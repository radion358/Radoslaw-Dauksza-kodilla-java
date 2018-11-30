package com.kodilla.good.patterns.challenges;

public class StreamMain {
    public static void main(String[] args) {
        MovieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .forEach(s -> System.out.print(s + " ! "));
    }
}
