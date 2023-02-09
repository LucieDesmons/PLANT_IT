package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.PlantConversation;


@Repository
public interface PlantConversationRepository extends CrudRepository<PlantConversation, Integer> {

}
