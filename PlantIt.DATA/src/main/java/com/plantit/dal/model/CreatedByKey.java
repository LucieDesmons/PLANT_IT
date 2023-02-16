package com.plantit.dal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CreatedByKey implements Serializable {

    @Column(name = "PlantReference_idPlantReference")
    private int idPlantReference;

    @Column(name = "User_idUser")
    private int idUser;


    /***** GETTER & SETTER *****/

    public int getIdPlantReference() {
        return idPlantReference;
    }

    public void setIdPlantReference(int idPlantReference) {
        this.idPlantReference = idPlantReference;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
