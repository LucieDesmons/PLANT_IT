package com.plantit.dal.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "plant")
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPlant")
    private Long idPlant;

    @Column(name = "placePlant")
    private String placePlant;

    @Column(name = "container")
    private String container;

    @Column(name = "humidity")
    private int humidity;

    @Column(name = "clarity")
    private String clarity;

    @ManyToOne
    @JoinColumn(name="User_idUser", nullable=false)
    private User user;

    @ManyToOne
    @JoinColumn(name="idPlantReference")
    private PlantReference plantReference;

    @ManyToMany
    @JoinTable(
            name = "plantPicture",
            joinColumns = @JoinColumn(name = "Plant_idPlant"),
            inverseJoinColumns = @JoinColumn(name = "Picture_idPicture")
    )
    Set<Picture> pictureCollection;

    @ManyToMany
    @JoinTable(
            name = "plantConversation",
            joinColumns = @JoinColumn(name = "Plant_idPlant"),
            inverseJoinColumns = @JoinColumn(name = "Conversation_idConversation")
    )
    Set<Conversation> conversationCollection;


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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PlantReference getPlantReference() {
        return plantReference;
    }

    public void setPlantReference(PlantReference plantReference) {
        this.plantReference = plantReference;
    }

    public Set<Picture> getPictureCollection() {
        return pictureCollection;
    }

    public void setPictureCollection(Set<Picture> pictureCollection) {
        this.pictureCollection = pictureCollection;
    }

    public Set<Conversation> getConversationCollection() {
        return conversationCollection;
    }

    public void setConversationCollection(Set<Conversation> conversationCollection) {
        this.conversationCollection = conversationCollection;
    }


    /***** CONSTRUCTOR *****/

    public Plant() {

    }

    public Plant(String placePlant, String container, int humidity, String clarity, User user, PlantReference plantReference) {
        super();
        this.placePlant = placePlant;
        this.container = container;
        this.humidity = humidity;
        this.clarity = clarity;
        this.user = user;
        this.plantReference = plantReference;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "Plant [placePlant=" + placePlant + ", container=" + container + ", humidity=" + humidity +
                "clarity=" + clarity + ", idUser=" + user.getIdUser() + ", idPlantReference=" + plantReference.getIdPlantReference() +"]";
    }

}