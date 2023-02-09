package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.MaintenanceUser;

@Repository
public interface MaintenanceUserRepository extends CrudRepository<MaintenanceUser, Integer> {

}
