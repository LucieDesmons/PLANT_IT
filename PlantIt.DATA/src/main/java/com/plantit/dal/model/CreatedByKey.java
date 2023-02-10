package com.plantit.dal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CreatedByKey implements Serializable {

    @Column(name = "PlantReference_idPlantReference")
    Long idPlantReference;

    @Column(name = "User_idUser")
    Long idUser;

    public Long getIdPlantReference() {
        return idPlantReference;
    }

    public void setIdPlantReference(Long plantReferenceId) {
        this.idPlantReference = plantReferenceId;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long userId) {
        this.idUser = userId;
    }
}
