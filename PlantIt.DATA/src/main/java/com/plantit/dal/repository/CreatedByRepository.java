package com.plantit.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.CreatedBy;

@Repository
public interface CreatedByRepository extends JpaRepository<CreatedBy, Integer> {

}
