package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName(){
//Given
        String name = "test List";
        TaskList taskList = new TaskList(name, "Test");
        taskListDao.save(taskList);

        //When
        List<TaskList> readTasksLists = taskListDao.findByListName(name);

        //Then
        Assert.assertEquals(1, readTasksLists.size());
        Assert.assertEquals(name, readTasksLists.get(0).getListName());
        //CleanUp
        int id = readTasksLists.get(0).getId();
        taskListDao.delete(id);
    }
}
