package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    private TaskFactory factory = new TaskFactory();
    private Task task;
    @Test
    public void testShoppingTask() {
        //Given
        task = factory.makeTask(TaskFactory.SHOPPING);
        //When
        String taskName = task.getTaskName();
        task.executeTask();
        //Then
        Assert.assertEquals("buy milk",taskName);
        Assert.assertEquals(true, task.isTaskExecuted());
    }


    @Test public void testPaintingTask() {
        //Given
        task = factory.makeTask(TaskFactory.PAINTING);
        //When
        String taskName = task.getTaskName();
        //Then
        Assert.assertEquals("paint corridor",taskName);
        Assert.assertEquals(false, task.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        task = factory.makeTask(TaskFactory.DRIVING);
        //When
        String taskName = task.getTaskName();
        //Then
        Assert.assertEquals("drive to shop",taskName);
        Assert.assertEquals(false, task.isTaskExecuted());
    }
}
