package com.plantit.dal.repositories;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.entities.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

}
