package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Student implements Observable {
    private final List<Observer> observers = new ArrayList<>();
    private final Deque<Task> tasks =new ArrayDeque<>();
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public  void addTask(Task task) {
        tasks.offer(task);
        notifyObservers();
    }

    public Task getTask() {
        return tasks.pop();
    }

    public String getName() {
        return name;
    }

    public int getHowManyTasks() {
        return tasks.size();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (observers != null ? !observers.equals(student.observers) : student.observers != null) return false;
        if (tasks != null ? !tasks.equals(student.tasks) : student.tasks != null) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = observers != null ? observers.hashCode() : 0;
        result = 31 * result + (tasks != null ? tasks.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
