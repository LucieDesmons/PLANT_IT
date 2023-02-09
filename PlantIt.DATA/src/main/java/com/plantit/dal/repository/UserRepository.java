package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
