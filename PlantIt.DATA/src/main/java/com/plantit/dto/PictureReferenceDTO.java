package com.plantit.dto;

import java.util.Date;
import java.util.List;

public class PictureReferenceDTO {

    private Long idPictureReference;
    private String way;
    private Date modificationDate;
    private List<PlantReferenceDTO> plantReferenceCollection;


    /***** GETTER & SETTER *****/

    public Long getIdPictureReference() {
        return idPictureReference;
    }

    public void setIdPictureReference(Long idPictureReference) {
        this.idPictureReference = idPictureReference;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public List<PlantReferenceDTO> getPlantReferenceCollection() {
        return plantReferenceCollection;
    }

    public void setPlantReferenceCollection(List<PlantReferenceDTO> plantReferenceCollection) {
        this.plantReferenceCollection = plantReferenceCollection;
    }


    /***** CONSTRUCTOR *****/

    public PictureReferenceDTO() {
    }

}
