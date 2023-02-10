package com.plantit.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
