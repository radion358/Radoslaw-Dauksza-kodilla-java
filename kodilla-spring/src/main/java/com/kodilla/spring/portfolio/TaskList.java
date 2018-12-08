package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

class TaskList {
    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }
    void addTask(String task) {
        tasks.add(task);
    }

    List<String> getTasks() {
        return new ArrayList<>(tasks);
    }
}
