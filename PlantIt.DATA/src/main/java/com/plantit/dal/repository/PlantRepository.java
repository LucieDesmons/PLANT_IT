package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.Plant;

@Repository
public interface PlantRepository extends CrudRepository<Plant, Integer> {

}
