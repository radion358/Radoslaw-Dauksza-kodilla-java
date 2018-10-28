package com.kodilla.exception.test;

public class ExceptionHandling {
   public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result = null;
        try {
            result = secondChallenge.probablyIWillThrowException(11, 34);
        } catch (Exception e) {
           result = "Oh no! Something went wrong! Error: " + e;
        } finally {
            System.out.println(result);
        }
    } 
}
