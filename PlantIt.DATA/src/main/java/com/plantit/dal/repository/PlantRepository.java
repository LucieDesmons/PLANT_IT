package com.plantit.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.Plant;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Long> {

}