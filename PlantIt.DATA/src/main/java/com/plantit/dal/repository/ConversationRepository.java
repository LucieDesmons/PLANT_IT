package com.plantit.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.Conversation;

@Repository
public interface ConversationRepository extends JpaRepository<Conversation, Long> {

}
