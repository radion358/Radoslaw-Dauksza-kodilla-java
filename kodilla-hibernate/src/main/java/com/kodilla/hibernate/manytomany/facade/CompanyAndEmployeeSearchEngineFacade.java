package com.kodilla.hibernate.manytomany.facade;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyAndEmployeeSearchEngineFacade {
    private final CompanyMapper companyMapper;
    private final CompanyService companyService;
    private final EmployeeMapper employeeMapper;
    private final EmployeeService employeeService;

    public CompanyAndEmployeeSearchEngineFacade(CompanyMapper companyMapper, CompanyService companyService,
                                                EmployeeMapper employeeMapper, EmployeeService employeeService) {
        this.companyMapper = companyMapper;
        this.companyService = companyService;
        this.employeeMapper = employeeMapper;
        this.employeeService = employeeService;
    }

    public List<CompanyDto> retrieveCompaniesWithNameStartingWith(String startingWith) {
        return companyMapper.mapToCompanyDtoList(companyService.retrieveCompaniesWithMameStartingWith(startingWith));
    }

    public List<CompanyDto> retrieveCompaniesWithNameContaining(String arg) {
        return companyMapper.mapToCompanyDtoList(companyService.retrieveCompaniesWithNameContaining(arg));
    }

    public List<EmployeeDto> retrieveEmployeesWithLastNameContaining(String arg) {
        return employeeMapper.mapToEmployeeDtoList(employeeService.retrieveEmplyeesWithLastNameContaining(arg));
    }

    public List<EmployeeDto> retrieveEmployeeWithLastName(String lastName) {
        return employeeMapper.mapToEmployeeDtoList(employeeService.retrieveEmployeeWithLastName(lastName));
    }
}
