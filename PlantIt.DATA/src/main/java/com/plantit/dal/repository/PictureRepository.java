package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.Picture;


@Repository
public interface PictureRepository extends CrudRepository<Picture, Integer> {

}
