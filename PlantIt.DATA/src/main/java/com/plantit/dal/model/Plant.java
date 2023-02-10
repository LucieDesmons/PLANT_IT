package com.plantit.dal.model;

import jakarta.persistence.*;

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

    @Id
    @Column(name = "User_idUser")
    private int userIdUser;

    @Id
    @Column(name = "idPlantReference")
    private int idPlantReference;


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

    public int getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(int userIdUser) {
        this.userIdUser = userIdUser;
    }

    public int getIdPlantReference() {
        return idPlantReference;
    }

    public void setIdPlantReference(int idPlantReference) {
        this.idPlantReference = idPlantReference;
    }

    /***** CONSTRUCTOR *****/

    public Plant() {

    }

    public Plant(String placePlant, String container, int humidity, String clarity, int userIdUser, int idPlantReference) {
        super();
        this.placePlant = placePlant;
        this.container = container;
        this.humidity = humidity;
        this.clarity = clarity;
        this.userIdUser = userIdUser;
        this.idPlantReference = idPlantReference;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "Plant [placePlant=" + placePlant + ", container=" + container + ", humidity=" + humidity +
                "clarity=" + clarity + ", userIdUser=" + userIdUser + ", idPlantReference=" + idPlantReference +"]";
    }

}