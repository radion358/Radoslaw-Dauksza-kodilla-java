package com.kodilla.patterns.strategy.social;

public class User {
    private String name;
    protected SocialPublisher socialPublisher;

    public String getName() {
        return name;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public User(String name) {
        this.name = name;
        this.socialPublisher = socialPublisher;
    }

    public String sharePost(String post) {
        return socialPublisher.share(name, post);
    }
}
