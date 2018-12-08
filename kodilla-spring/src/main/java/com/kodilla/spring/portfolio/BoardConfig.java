package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    private TaskList toDoList;

    @Autowired
    @Qualifier("inProgress")
    private TaskList inProgress;

    @Autowired
    @Qualifier("doneList")
    private TaskList doneList;

    @Bean
    Board getBoard() {
        return new Board(toDoList, inProgress, doneList);
    }

    @Bean(name = "toDoList")
    TaskList getToDoTaskList() {
        return new TaskList();
    }

    @Bean(name = "inProgress")
    TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    TaskList getDoneList() {
        return new TaskList();
    }

}
