package com.plantit.dal.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "maintenance")
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMaintenance")
    private Long idMaintenance;

    @Column(name = "predictedDate")
    private Date predictedDate;

    @Column(name = "realizedDate")
    private Date realizedDate;

    @Column(name = "report")
    private String report;


    /***** JOIN TABLE *****/

    @ManyToMany
    @JoinTable(
            name = "maintenancepicture",
            joinColumns = @JoinColumn(name = "Maintenance_idMaintenance"),
            inverseJoinColumns = @JoinColumn(name = "Picture_idPicture"))
    private Set<Picture> pictureCollection;

    @ManyToMany
    @JoinTable(
            name = "maintenanceuser",
            joinColumns = @JoinColumn(name = "Maintenance_idMaintenance"),
            inverseJoinColumns = @JoinColumn(name = "User_idUser"))
    private Set<User> userCollection;


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

    public Set<Picture> getPictureCollection() {
        return pictureCollection;
    }

    public void setPictureCollection(Set<Picture> pictureCollection) {
        this.pictureCollection = pictureCollection;
    }

    public Set<User> getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(Set<User> userCollection) {
        this.userCollection = userCollection;
    }


    /***** CONSTRUCTOR *****/

    public Maintenance() {

    }

    public Maintenance(Date predictedDate, Date realizedDate, String report) {
        super();
        this.predictedDate = predictedDate;
        this.realizedDate = realizedDate;
        this.report = report;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "Maintenance [predictedDate=" + predictedDate + ", realizedDate=" + realizedDate + ", report=" + report + "]";
    }

}