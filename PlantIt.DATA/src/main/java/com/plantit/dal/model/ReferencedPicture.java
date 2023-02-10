package com.plantit.dal.model;

import jakarta.persistence.*;

@Entity
@Table(name = "referencedpicture")
public class ReferencedPicture {

    @Id
    @Column(name = "PlantReference_idPlantReference")
    private int plantReferenceIdPlantReference;

    @Id
    @Column(name = "PictureReference_idPictureReference")
    private int pictureReferenceIdPictureReference;


    /***** GETTER & SETTER *****/

    public int getPlantReferenceIdPlantReference() {
        return plantReferenceIdPlantReference;
    }

    public void setPlantReferenceIdPlantReference(int plantReferenceIdPlantReference) {
        this.plantReferenceIdPlantReference = plantReferenceIdPlantReference;
    }

    public int getPictureReferenceIdPictureReference() {
        return pictureReferenceIdPictureReference;
    }

    public void setPictureReferenceIdPictureReference(int pictureReferenceIdPictureReference) {
        this.pictureReferenceIdPictureReference = pictureReferenceIdPictureReference;
    }


    /***** CONSTRUCTOR *****/

    public ReferencedPicture() {

    }

    public ReferencedPicture(int plantReferenceIdPlantReference, int pictureReferenceIdPictureReference) {
        super();
        this.plantReferenceIdPlantReference = plantReferenceIdPlantReference;
        this.pictureReferenceIdPictureReference = pictureReferenceIdPictureReference;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "ReferencedPicture [plantReferenceIdPlantReference=" + plantReferenceIdPlantReference + ", pictureReferenceIdPictureReference=" + pictureReferenceIdPictureReference + "]";
    }

}