package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share(String name, String post) {
        return "[ " + name + " post on facebook ]\n"
                + post + "\n";
    }
}
