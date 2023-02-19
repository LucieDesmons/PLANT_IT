package com.plantit.dto;

import java.util.Date;
import java.util.List;

public class PictureDTO {

    private Long idPicture;
    private String way;
    private Date updateDate;
    private List<MaintenanceDTO> maintenanceCollection;
    private List<PlantDTO> plantCollection;


    /***** GETTER & SETTER *****/

    public Long getIdPicture() {
        return idPicture;
    }

    public void setIdPicture(Long idPicture) {
        this.idPicture = idPicture;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public List<MaintenanceDTO> getMaintenanceCollection() {
        return maintenanceCollection;
    }

    public void setMaintenanceCollection(List<MaintenanceDTO> maintenanceCollection) {
        this.maintenanceCollection = maintenanceCollection;
    }

    public List<PlantDTO> getPlantCollection() {
        return plantCollection;
    }

    public void setPlantCollection(List<PlantDTO> plantCollection) {
        this.plantCollection = plantCollection;
    }


    /***** CONSTRUCTOR *****/

    public PictureDTO() {
    }

}
