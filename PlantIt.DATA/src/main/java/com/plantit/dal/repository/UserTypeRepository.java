package com.plantit.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.UserType;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long> {

}
