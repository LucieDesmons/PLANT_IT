package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.CreatedBy;

@Repository
public interface CreatedByRepository extends CrudRepository<CreatedBy, Integer> {

}
