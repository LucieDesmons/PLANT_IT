package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.UserHistoric;

@Repository
public interface UserHistoricRepository extends CrudRepository<UserHistoric, Integer> {

}
