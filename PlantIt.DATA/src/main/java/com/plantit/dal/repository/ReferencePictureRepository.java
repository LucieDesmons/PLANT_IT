package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.ReferencedPicture;


@Repository
public interface ReferencePictureRepository extends CrudRepository<ReferencedPicture, Integer> {

}
