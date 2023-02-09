package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.Maintenance;

@Repository
public interface MaintenanceRepository extends CrudRepository<Maintenance, Integer> {

}
