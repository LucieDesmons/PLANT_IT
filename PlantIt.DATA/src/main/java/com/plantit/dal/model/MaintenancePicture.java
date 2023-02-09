package com.plantit.dal.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "maintenancepicture")
public class MaintenancePicture {

    @Column(name = "Maintenance_idMaintenance")
    private int maintenanceIdMaintenance;

    @Column(name = "Picture_idPicture")
    private int PictureIdPicture;

    /***** GETTER & SETTER *****/

    public int getMaintenanceIdMaintenance() {
        return maintenanceIdMaintenance;
    }

    public void setMaintenanceIdMaintenance(int maintenanceIdMaintenance) {
        this.maintenanceIdMaintenance = maintenanceIdMaintenance;
    }

    public int getPictureIdPicture() {
        return PictureIdPicture;
    }

    public void setPictureIdPicture(int pictureIdPicture) {
        PictureIdPicture = pictureIdPicture;
    }


    /***** CONSTRUCTOR *****/

    public MaintenancePicture() {

    }

    public MaintenancePicture(int maintenanceIdMaintenance, int PictureIdPicture) {
        super();
        this.maintenanceIdMaintenance = maintenanceIdMaintenance;
        this.PictureIdPicture = PictureIdPicture;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "MaintenancePicture [maintenanceIdMaintenance" + maintenanceIdMaintenance + "PictureIdPicture=" + PictureIdPicture + "]";
    }

}