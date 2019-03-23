package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    private final CompanyDao companyDao;

    public CompanyService(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    public List<Company> retrieveCompaniesWithNameContaining(String arg) {
        return companyDao.retrieveCompaniesWithNameContaining(arg);
    }

    public List<Company> retrieveCompaniesWithMameStartingWith(String startingWith) {
        return companyDao.retrieveCompaniesWithNameStartingWith(startingWith);
    }
}
