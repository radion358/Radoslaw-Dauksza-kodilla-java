package com.kodilla.hibernate.manytomany.facade;

public class EmployeeDto {
    private int id;
    private String firstname;
    private String lastname;

    public EmployeeDto(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
