package com.kodilla.testing.forum.statistics;

public class StatisticCalculator {
    private int numberOfUsers = 0;
    private int numberOfPosts = 0;
    private int numberOfComment = 0;
    private double averageNumberOfPostPerUser = 0;
    private double averageNumberOfCommentPerUser = 0;
    private double averageNumberOfCommentPerPost = 0;

    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComment = statistics.commentsCount();
        if (numberOfUsers != 0) {
            this.averageNumberOfPostPerUser = (double) numberOfPosts / numberOfUsers;
            this.averageNumberOfCommentPerUser = (double) numberOfComment / numberOfUsers;
        }
        if (numberOfPosts != 0) {
            this.averageNumberOfCommentPerPost = (double) numberOfComment / numberOfPosts;
        }
    }

   public void showStatistics() {
        System.out.println("number of users :" + numberOfUsers );
        System.out.println("number of posts :" + numberOfPosts );
        System.out.println("number of comment :" + numberOfComment );
        System.out.println("average number of post per user :" + averageNumberOfPostPerUser );
        System.out.println("average number of comment per user :" + averageNumberOfCommentPerUser );
        System.out.println("average number of comment per post :" + averageNumberOfCommentPerPost );
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComment() {
        return numberOfComment;
    }

    public double getAverageNumberOfPostPerUser() {
        return averageNumberOfPostPerUser;
    }

    public double getAverageNumberOfCommentPerUser() {
        return averageNumberOfCommentPerUser;
    }

    public double getAverageNumberOfCommentPerPost() {
        return averageNumberOfCommentPerPost;
    }
}

