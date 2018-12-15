package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share(String name, String post) {
        return "[ " + name + " post on snapchat ]\n"
                + post + "\n";
    }
}
