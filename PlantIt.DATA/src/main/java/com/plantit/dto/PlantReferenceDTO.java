package com.plantit.dto;

import java.util.List;

public class PlantReferenceDTO {

    private Long idPlantReference;
    private String family;
    private int size;
    private String foodSource;
    private String reproduction;
    private int lifetime;
    private String placeLife;
    private List<CreatedByDTO> createdByCollection;
    private List<PlantDTO> plantCollection;
    private List<PictureReferenceDTO> pictureReferenceCollection;


    /***** GETTER & SETTER *****/

    public Long getIdPlantReference() {
        return idPlantReference;
    }

    public void setIdPlantReference(Long idPlantReference) {
        this.idPlantReference = idPlantReference;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFoodSource() {
        return foodSource;
    }

    public void setFoodSource(String foodSource) {
        this.foodSource = foodSource;
    }

    public String getReproduction() {
        return reproduction;
    }

    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    public String getPlaceLife() {
        return placeLife;
    }

    public void setPlaceLife(String placeLife) {
        this.placeLife = placeLife;
    }

    public List<CreatedByDTO> getCreatedByCollection() {
        return createdByCollection;
    }

    public void setCreatedByCollection(List<CreatedByDTO> createdByCollection) {
        this.createdByCollection = createdByCollection;
    }

    public List<PlantDTO> getPlantCollection() {
        return plantCollection;
    }

    public void setPlantCollection(List<PlantDTO> plantCollection) {
        this.plantCollection = plantCollection;
    }

    public List<PictureReferenceDTO> getPictureReferenceCollection() {
        return pictureReferenceCollection;
    }

    public void setPictureReferenceCollection(List<PictureReferenceDTO> pictureReferenceCollection) {
        this.pictureReferenceCollection = pictureReferenceCollection;
    }


    /***** CONSTRUCTOR *****/

    public PlantReferenceDTO() {
    }

}
