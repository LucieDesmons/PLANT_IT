package com.plantit.dto;

import java.util.Date;
import java.util.List;

public class MaintenanceDTO {

    private Long idMaintenance;
    private Date predictedDate;
    private Date realizedDate;
    private String report;
    private List<PictureDTO> pictureCollection;
    private List<UserDTO> userCollection;


    /***** GETTER & SETTER *****/

    public Long getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(Long idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public Date getPredictedDate() {
        return predictedDate;
    }

    public void setPredictedDate(Date predictedDate) {
        this.predictedDate = predictedDate;
    }

    public Date getRealizedDate() {
        return realizedDate;
    }

    public void setRealizedDate(Date realizedDate) {
        this.realizedDate = realizedDate;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public List<PictureDTO> getPictureCollection() {
        return pictureCollection;
    }

    public void setPictureCollection(List<PictureDTO> pictureCollection) {
        this.pictureCollection = pictureCollection;
    }

    public List<UserDTO> getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(List<UserDTO> userCollection) {
        this.userCollection = userCollection;
    }


    /***** CONSTRUCTOR *****/

    public MaintenanceDTO() {
    }

}
