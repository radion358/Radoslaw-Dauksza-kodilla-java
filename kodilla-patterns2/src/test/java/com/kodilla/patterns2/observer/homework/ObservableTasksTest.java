package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ObservableTasksTest {
    @Test
    public void testUpdate() {
        //Given
        Mentor pabloEscobar = new Mentor("Pablo Escobar");
        Mentor heisenberg = new Mentor("Walter White");
        Student johnSmith = new Student("John Smith");
        Student ivoneEscobar = new Student("Ivone Escobar");
        Student jessiePinkman = new Student("Jessie Pinkman");
        jessiePinkman.registerObserver(heisenberg);
        ivoneEscobar.registerObserver(pabloEscobar);
        johnSmith.registerObserver(pabloEscobar);
        johnSmith.registerObserver(heisenberg);
        //When
        jessiePinkman.addTask(new Task("test task 1"));
        jessiePinkman.addTask(new Task("test task 2"));
        jessiePinkman.addTask(new Task("test task 3"));
        ivoneEscobar.addTask(new Task("test task 1"));
        ivoneEscobar.addTask(new Task("test task 2"));
        johnSmith.addTask(new Task("test task 1"));
        johnSmith.addTask(new Task("test task 2"));
        //Then
        assertEquals(4, pabloEscobar.getUpdateCount());
        assertEquals(5, heisenberg.getUpdateCount());
    }

    @Test
    public void testResolveTasks() {
        //Given
        Mentor pabloEscobar = new Mentor("Pablo Escobar");
        Mentor heisenberg = new Mentor("Walter White");
        Student johnSmith = new Student("John Smith");
        Student ivoneEscobar = new Student("Ivone Escobar");
        Student jessiePinkman = new Student("Jessie Pinkman");
        jessiePinkman.registerObserver(heisenberg);
        ivoneEscobar.registerObserver(pabloEscobar);
        johnSmith.registerObserver(pabloEscobar);
        johnSmith.registerObserver(heisenberg);
        jessiePinkman.addTask(new Task("test task 1"));
        jessiePinkman.addTask(new Task("test task 2"));
        ivoneEscobar.addTask(new Task("test task 1"));
        ivoneEscobar.addTask(new Task("test task 2"));
        johnSmith.addTask(new Task("test task 1"));
        johnSmith.addTask(new Task("test task 2"));
        //When
        heisenberg.resolveTasks();
        //Then
        assertEquals(0, jessiePinkman.getHowManyTasks());
        assertEquals(0, johnSmith.getHowManyTasks());
        assertEquals(2, ivoneEscobar.getHowManyTasks());
    }
}
