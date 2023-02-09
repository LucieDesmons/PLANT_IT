package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.UserType;

@Repository
public interface UserTypeRepository extends CrudRepository<UserType, Integer> {

}
