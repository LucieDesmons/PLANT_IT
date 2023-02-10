package com.plantit.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.UserHistoric;

@Repository
public interface UserHistoricRepository extends JpaRepository<UserHistoric, Long> {

}
