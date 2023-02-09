package com.plantit.dal.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "created_by")
public class CreatedBy {

    @Column(name = "PlantReference_idPlantReference")
    private int idPlantReference;

    @Column(name = "User_idUser")
    private int userIdUser;

    @Column(name = "orderNum")
    private int orderNum;

    @Column(name = "updateDate")
    private Date updateDate;


    /***** GETTER & SETTER *****/

    public int getIdPlantReference() {
        return idPlantReference;
    }

    public void setIdPlantReference(int idPlantReference) {
        this.idPlantReference = idPlantReference;
    }

    public int getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(int userIdUser) {
        this.userIdUser = userIdUser;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }


    /***** CONSTRUCTOR *****/

    public CreatedBy() {

    }

    public CreatedBy(int idPlantReference, int userIdUser, int orderNum, Date updateDate) {
        super();
        this.idPlantReference = idPlantReference;
        this.userIdUser = userIdUser;
        this.orderNum = orderNum;
        this.updateDate = updateDate;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "CreatedBy [idPlantReference" + idPlantReference + "userIdUser=" + userIdUser + ", orderNum=" + orderNum + "updateDate" + updateDate + "]";
    }

}