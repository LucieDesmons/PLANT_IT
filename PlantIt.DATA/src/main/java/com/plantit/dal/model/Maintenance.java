package com.plantit.dal.model;

import jakarta.persistence.*;

import java.util.Date;

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