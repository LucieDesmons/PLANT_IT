package com.plantit.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.ReferencedPicture;


@Repository
public interface ReferencedPictureRepository extends JpaRepository<ReferencedPicture, Integer> {

}
