package com.plantit.dal.model;

import jakarta.persistence.*;

@Entity
@Table(name = "plantpicture")
public class PlantPicture {

    @Column(name = "Plant_idPlant")
    private int plantIdPlant;

    @Column(name = "Picture_idPicture")
    private int pictureIdPicture;


    /***** GETTER & SETTER *****/

    public int getPlantIdPlant() {
        return plantIdPlant;
    }

    public void setPlantIdPlant(int plantIdPlant) {
        this.plantIdPlant = plantIdPlant;
    }

    public int getPictureIdPicture() {
        return pictureIdPicture;
    }

    public void setPictureIdPicture(int pictureIdPicture) {
        this.pictureIdPicture = pictureIdPicture;
    }


    /***** CONSTRUCTOR *****/

    public PlantPicture() {

    }

    public PlantPicture(int plantIdPlant, int pictureIdPicture) {
        super();
        this.plantIdPlant = plantIdPlant;
        this.pictureIdPicture = pictureIdPicture;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "PlantPicture [plantIdPlant=" + plantIdPlant + ", pictureIdPicture=" + pictureIdPicture + "]";
    }

}