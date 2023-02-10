package com.plantit.dal.model;

import jakarta.persistence.*;

@Entity
@Table(name = "plantconversation")
public class PlantConversation {

    @Id
    @Column(name = "Plant_idPlant")
    private int plantIdPlant;

    @Id
    @Column(name = "Conversation_idConversation")
    private int conversationIdConversation;


    /***** GETTER & SETTER *****/

    public int getPlantIdPlant() {
        return plantIdPlant;
    }

    public void setPlantIdPlant(int plantIdPlant) {
        this.plantIdPlant = plantIdPlant;
    }

    public int getConversationIdConversation() {
        return conversationIdConversation;
    }

    public void setConversationIdConversation(int conversationIdConversation) {
        this.conversationIdConversation = conversationIdConversation;
    }

    /***** CONSTRUCTOR *****/

    public PlantConversation() {

    }

    public PlantConversation(int plantIdPlant, int conversationIdConversation) {
        super();
        this.plantIdPlant = plantIdPlant;
        this.conversationIdConversation = conversationIdConversation;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "PlantConversation [plantIdPlant=" + plantIdPlant + ", conversationIdConversation=" + conversationIdConversation + "]";
    }

}