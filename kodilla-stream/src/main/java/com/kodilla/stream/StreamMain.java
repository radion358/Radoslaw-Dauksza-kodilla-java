package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultForumUserMap = forum.getUserList().stream()
                .filter(c -> c.getSex() == 'M')
                .filter(i -> LocalDate.now().getYear() - i.getDateOfBirth().getYear() >= 20)
                .filter(i -> i.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        resultForumUserMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out :: println);
    }
}
