package com.dudu.repositories;


import com.dudu.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<UserEntity,Long> {
}
