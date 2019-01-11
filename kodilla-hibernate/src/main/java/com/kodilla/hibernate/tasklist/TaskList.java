package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKS_LISTS")
public class TaskList {
    private int id;
    private String listName;
    private String description;

    public TaskList(String listName, String description) {
        this.id = id;
        this.listName = listName;
        this.description = description;
    }

    public TaskList() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "LIST_NAME")
    public String getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    private void setDescription(String description) {
        this.description = description;
    }
}
