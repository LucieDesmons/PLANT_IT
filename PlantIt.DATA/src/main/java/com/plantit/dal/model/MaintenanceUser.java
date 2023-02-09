package com.plantit.dal.model;

import jakarta.persistence.*;

@Entity
@Table(name = "maintenanceuser")
public class MaintenanceUser {

    @Column(name = "Maintenance_idMaintenance")
    private int maintenanceIdMaintenance;

    @Column(name = "User_idUser")
    private int userIdUser;


    /***** GETTER & SETTER *****/

    public int getMaintenanceIdMaintenance() {
        return maintenanceIdMaintenance;
    }

    public void setMaintenanceIdMaintenance(int maintenanceIdMaintenance) {
        this.maintenanceIdMaintenance = maintenanceIdMaintenance;
    }

    public int getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(int userIdUser) {
        this.userIdUser = userIdUser;
    }

    /***** CONSTRUCTOR *****/

    public MaintenanceUser() {

    }

    public MaintenanceUser(int maintenanceIdMaintenance, int userIdUser) {
        super();
        this.maintenanceIdMaintenance = maintenanceIdMaintenance;
        this.userIdUser = userIdUser;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "MaintenanceUser [maintenanceIdMaintenance" + maintenanceIdMaintenance + "userIdUser=" + userIdUser + "]";
    }

}