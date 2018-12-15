package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share(String name, String post) {
        return "[ " + name + " post on twitter ]\n"
                + post + "\n";
    }
}
