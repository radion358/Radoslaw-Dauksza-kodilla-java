package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    void addToDoTask(String task) {
        toDoList.addTask(task);
    }

    void addInProgressTask(String task) {
        inProgressList.addTask(task);
    }

    void addDoneTask(String task) {
        doneList.addTask(task);
    }

    List<String> getToDoTasks() {
        return new ArrayList<>(toDoList.getTasks());
    }

    List<String> getInProgressTasks() {
        return new ArrayList<>(inProgressList.getTasks());
    }

    List<String> getDoneTasks() {
        return new ArrayList<>(doneList.getTasks());
    }
}
