package com.dudu.repositories;

import com.dudu.entities.CompanyEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICompanyRepository extends CrudRepository<CompanyEntity,Long> {
    public CompanyEntity findByName(String name);
    public CompanyEntity findByAddress(String address);

}

