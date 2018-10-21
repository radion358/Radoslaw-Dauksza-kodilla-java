package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers;

    public Forum() {
        forumUsers = new ArrayList<>();
        forumUsers.add(new ForumUser(1, "Adam", 'M',
                LocalDate.of(1980,3,6), 5));
        forumUsers.add(new ForumUser(2, "Tomek", 'M',
                LocalDate.of(1999,2,12), 0));
        forumUsers.add(new ForumUser(3, "Anna", 'K',
                LocalDate.of(1983,4,22), 1));
        forumUsers.add(new ForumUser(4, "Bogdan", 'M',
                LocalDate.of(1968,6,9), 2));
        forumUsers.add(new ForumUser(5, "Sylvia", 'K',
                LocalDate.of(1955,11,14), 3));
        forumUsers.add(new ForumUser(6, "Daria", 'K',
                LocalDate.of(2005,6,18), 4));
        forumUsers.add(new ForumUser(7, "Laura", 'K',
                LocalDate.of(1995,8,8), 0));
        forumUsers.add(new ForumUser(8, "Filip", 'M',
                LocalDate.of(2012,1,21), 0));
        forumUsers.add(new ForumUser(9, "Monica", 'K',
                LocalDate.of(2008,2,17), 3));
        forumUsers.add(new ForumUser(10, "Peter", 'M',
                LocalDate.of(2015,5,10), 6));
        forumUsers.add(new ForumUser(11, "Benedikt", 'M',
                LocalDate.of(2014,4,2), 0));
        forumUsers.add(new ForumUser(12, "Sara", 'K',
                LocalDate.of(2003,7,4), 2));
        forumUsers.add(new ForumUser(13, "Lukas", 'M',
                LocalDate.of(2011,12,24), 1));
        forumUsers.add(new ForumUser(14, "David", 'M',
                LocalDate.of(2010,9,1), 9));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }
}
