package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CompanyMapper {
    public CompanyDto mapToCompanyDto(Company company) {
        return new CompanyDto(company.getId(), company.getName());
    }

    public List<CompanyDto> mapToCompanyDtoList(List<Company> companies) {
        return companies.stream()
                .map(this::mapToCompanyDto)
                .collect(Collectors.toList());
    }
}
