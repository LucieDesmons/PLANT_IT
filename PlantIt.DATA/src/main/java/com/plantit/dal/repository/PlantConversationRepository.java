package com.plantit.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.PlantConversation;


@Repository
public interface PlantConversationRepository extends JpaRepository<PlantConversation, Integer> {

}
