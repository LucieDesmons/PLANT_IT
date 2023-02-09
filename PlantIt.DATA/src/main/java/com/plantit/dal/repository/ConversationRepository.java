package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.Conversation;

@Repository
public interface ConversationRepository extends CrudRepository<Conversation, Integer> {

}
