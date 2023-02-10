package com.plantit.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.PictureReference;

@Repository
public interface PictureReferenceRepository extends JpaRepository<PictureReference, Long> {

}
