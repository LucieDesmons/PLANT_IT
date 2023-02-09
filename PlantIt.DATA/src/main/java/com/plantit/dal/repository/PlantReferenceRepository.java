package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.PlantReference;


@Repository
public interface PlantReferenceRepository extends CrudRepository<PlantReference, Integer> {

}
