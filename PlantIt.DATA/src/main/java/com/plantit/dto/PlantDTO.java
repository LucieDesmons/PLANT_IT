package com.plantit.dto;

import java.util.Date;
import java.util.List;

public class PlantDTO {

    private Long idPlant;
    private String placePlant;
    private String container;
    private int humidity;
    private String clarity;
    private UserDTO user;
    private PlantReferenceDTO plantReference;
    private List<PictureDTO> pictureCollection;
    private List<ConversationDTO> conversationCollection;


    /***** GETTER & SETTER *****/

    public Long getIdPlant() {
        return idPlant;
    }

    public void setIdPlant(Long idPlant) {
        this.idPlant = idPlant;
    }

    public String getPlacePlant() {
        return placePlant;
    }

    public void setPlacePlant(String placePlant) {
        this.placePlant = placePlant;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getClarity() {
        return clarity;
    }

    public void setClarity(String clarity) {
        this.clarity = clarity;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public PlantReferenceDTO getPlantReference() {
        return plantReference;
    }

    public void setPlantReference(PlantReferenceDTO plantReference) {
        this.plantReference = plantReference;
    }

    public List<PictureDTO> getPictureCollection() {
        return pictureCollection;
    }

    public void setPictureCollection(List<PictureDTO> pictureCollection) {
        this.pictureCollection = pictureCollection;
    }

    public List<ConversationDTO> getConversationCollection() {
        return conversationCollection;
    }

    public void setConversationCollection(List<ConversationDTO> conversationCollection) {
        this.conversationCollection = conversationCollection;
    }


    /***** CONSTRUCTOR *****/

    public PlantDTO() {
    }

}
