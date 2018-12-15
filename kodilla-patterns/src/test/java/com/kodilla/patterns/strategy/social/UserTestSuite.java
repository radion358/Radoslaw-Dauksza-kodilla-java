package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User milenials = new Millenials("Roger");
        User yGeneration = new YGeneration("George");
        User zGeneration = new ZGeneration("Steven");

        //When
        String rogerPost = milenials.sharePost("something milenial");
        String georgePost = yGeneration.sharePost("something yyy");
        String stevenPost = zGeneration.sharePost("something zzz");
        System.out.println(rogerPost + georgePost + stevenPost);

        //Then
        Assert.assertEquals("[ Roger post on twitter ]\nsomething milenial\n", rogerPost);
        Assert.assertEquals("[ George post on facebook ]\nsomething yyy\n", georgePost);
        Assert.assertEquals("[ Steven post on snapchat ]\nsomething zzz\n", stevenPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User milenials = new Millenials("Roger");

        //When
        milenials.setSocialPublisher(new FacebookPublisher());
        String rogerPost = milenials.sharePost("something milenial");
        System.out.println(rogerPost);

        //Then
        Assert.assertEquals("[ Roger post on facebook ]\nsomething milenial\n", rogerPost);
    }
}