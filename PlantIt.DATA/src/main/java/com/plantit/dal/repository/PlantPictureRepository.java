package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.PlantPicture;

@Repository
public interface PlantPictureRepository extends CrudRepository<PlantPicture, Integer> {

}
