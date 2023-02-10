package com.plantit.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.PasswordHistoric;

@Repository
public interface PasswordHistoricRepository extends JpaRepository<PasswordHistoric, Long> {

}
