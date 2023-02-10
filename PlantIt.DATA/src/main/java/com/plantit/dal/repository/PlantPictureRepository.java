package com.plantit.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.PlantPicture;

@Repository
public interface PlantPictureRepository extends JpaRepository<PlantPicture, Integer> {

}
