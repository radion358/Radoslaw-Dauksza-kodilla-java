package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.addDoneTask("this task is done");
        board.addInProgressTask("this task is in progress");
        board.addToDoTask("this task ned to be done");

        //When
        List<String> doneTasks = board.getDoneTasks();
        List<String> inProgressTasks = board.getInProgressTasks();
        List<String> toDoTasks = board.getToDoTasks();

        //Then
        doneTasks.forEach(System.out::println);
        inProgressTasks.forEach(System.out::println);
        toDoTasks.forEach(System.out::println);

        Assert.assertEquals("this task is done", doneTasks.get(0));
        Assert.assertEquals("this task is in progress", inProgressTasks.get(0));
        Assert.assertEquals("this task ned to be done", toDoTasks.get(0));
    }
}
