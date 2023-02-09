package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {

}
