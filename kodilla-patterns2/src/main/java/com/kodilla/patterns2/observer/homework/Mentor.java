package com.kodilla.patterns2.observer.homework;

import java.util.HashSet;
import java.util.Set;

public class Mentor implements Observer {
    private final Set<Student> students;
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.students = new HashSet<>();
        this.name = name;
        this.updateCount = 0;
    }

    public void resolveTasks() {
        for (Student student : students) {
            while (student.getHowManyTasks() != 0) {
                System.out.println("mentor: " + name + " resolved task: " +
                        student.getTask().getName() + " from student: " + student.getName());
            }
        }
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(Student student) {
        students.add(student);
        updateCount++;
    }
}
