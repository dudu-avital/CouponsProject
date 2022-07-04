package com.dudu.controllers;

import com.dudu.dtos.Company;
import com.dudu.logic.CompaniesLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController// אנוטציה שאומרת לספרינג "תעטפי את הclass הזה ב-spring bean "
@RequestMapping("/companies")
public class CompaniesController {

    /* 2 שורות אלו אומרות לספרינג להחזיק רפרנס בשם companiesLogic לאובייקט העוטף (spring bean) של CompaniesLogic  */
    @Autowired
    private CompaniesLogic companiesLogic;

    //method = POST
    //http://localhost:8080/companies
    @PostMapping
    public long createCompany(@RequestBody Company company){

        return companiesLogic.createCompany(company);
    }

    //method = PUT
    // אנוטציה ל update
    //http://localhost:8080/companies
    @PutMapping
    public void updateCompany(@RequestBody Company company) {
        companiesLogic.updateCompany(company);
    }


    //method = GET
    // http://localhost:8080/companies
    @GetMapping
    public List<Company> getAllCompanies() {
        return companiesLogic.getAllCompanies();
    }


    //method = GET
    // http://localhost:8080/companies/5
    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable("id") long id) {

        return companiesLogic.getCompanyById(id);
    }



    //method = DELETE
    // http://localhost:8080/companies/5
    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable("id") long id) {
        companiesLogic.deleteCompany(id);
    }

    //method = GET
    // http://localhost:8080/companies/byName?name=dudu
    @GetMapping("/byName")
    public Company getCompanyByName(@RequestParam(name = "name") String name) {
        return companiesLogic.getCompanyByName(name);
    }
}
