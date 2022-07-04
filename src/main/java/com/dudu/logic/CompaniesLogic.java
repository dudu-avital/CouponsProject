package com.dudu.logic;

import com.dudu.dtos.Company;
import com.dudu.entities.CompanyEntity;
import com.dudu.repositories.ICompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompaniesLogic {

    @Autowired
    private ICompanyRepository companyRepository;


    public long createCompany(Company company) {

        CompanyEntity companyEntity = new CompanyEntity(company);
        companyRepository.save(companyEntity);
        return companyEntity.getId();

    }

    public void updateCompany(Company company) {
        // פעולה משולבת: שליחת אובייקט companyEntity לאחר שהומר מ company באמצעות ה ctor
        companyRepository.save(new CompanyEntity(company));
    }

    public Company getCompanyById(long id) {
        CompanyEntity companyEntity = companyRepository.findById(id).get();
        Company company = new Company(companyEntity);
        return company;  // המרה של companyEntity ל dto ואז החזרה
    }

    public List<Company> getAllCompanies() {
        List<Company> companyList = new ArrayList<>();
        Iterable<CompanyEntity> companiesIterable = companyRepository.findAll();
        for (CompanyEntity companyEntity : companiesIterable) {
            Company company = new Company(companyEntity);
            companyList.add(company);
        }
        return companyList;
    }

    public Company getCompanyByName(String name) {
        CompanyEntity companyEntity = companyRepository.findByName(name);
        Company company = new Company(companyEntity);
        return company;
        //   return new Company(companyRepository.findByName(name));
    }

    public void deleteCompany(long id) {
        companyRepository.deleteById(id);

    }
}

