package com.plantit.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.MaintenancePicture;

@Repository
public interface MaintenancePictureRepository extends JpaRepository<MaintenancePicture, Integer> {

}
