package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyAndEmployeeSearchEngineFacadeTest {

    @MockBean
    private CompanyDao companyDao;

    @MockBean
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyAndEmployeeSearchEngineFacade searchEngine;

    @Test
    public void retrieveCompaniesWithNameStartingWith() {
        //Given
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("company1"));
        when(companyDao.retrieveCompaniesWithNameStartingWith("company")).thenReturn(companies);

        //When
        List<CompanyDto> retrievedCompanies = searchEngine.retrieveCompaniesWithNameStartingWith("company");

        //Then
        assertEquals(1, retrievedCompanies.size());
    }

    @Test
    public void retrieveCompaniesWithNameContaining() {
        //Given
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("company1"));
        when(companyDao.retrieveCompaniesWithNameContaining("comp")).thenReturn(companies);

        //When
        List<CompanyDto> retrievedCompanies = searchEngine.retrieveCompaniesWithNameContaining("comp");

        //Then
        assertEquals(1, retrievedCompanies.size());
    }

    @Test
    public void retrieveEmployeesWithNameContaining() {
        //Given
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("testName", "testLastName"));
        when(employeeDao.retrieveEmployeesWithLastNameContaining("Last")).thenReturn(employees);

        //When
        List<EmployeeDto> retrievedEmployees = searchEngine.retrieveEmployeesWithLastNameContaining("Last");

        //Then
        assertEquals(1, retrievedEmployees.size());
    }

    @Test
    public void retrieveEmployeeWithLastName() {
        //Given
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("testName", "testLastName"));
        when(employeeDao.retrieveEmployeeWithLastName("testLastName")).thenReturn(employees);

        //When
        List<EmployeeDto> retrievedEmployees = searchEngine.retrieveEmployeeWithLastName("testLastName");

        //Then
        assertEquals(1, retrievedEmployees.size());
    }
}