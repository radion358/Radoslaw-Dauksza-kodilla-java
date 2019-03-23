package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> retrieveEmplyeesWithLastNameContaining(String arg) {
        return employeeDao.retrieveEmployeesWithLastNameContaining(arg);
    }

    public List<Employee> retrieveEmployeeWithLastName(String lastName) {
        return employeeDao.retrieveEmployeeWithLastName(lastName);
    }
}
