package com.plantit.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
