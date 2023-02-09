package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.Manage;

@Repository
public interface ManageRepository extends CrudRepository<Manage, Integer> {

}
