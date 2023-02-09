package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.MaintenancePicture;

@Repository
public interface MaintenancePictureRepository extends CrudRepository<MaintenancePicture, Integer> {

}
