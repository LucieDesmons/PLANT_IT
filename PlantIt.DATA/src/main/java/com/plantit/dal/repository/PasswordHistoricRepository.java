package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.PasswordHistoric;

@Repository
public interface PasswordHistoricRepository extends CrudRepository<PasswordHistoric, Integer> {

}
