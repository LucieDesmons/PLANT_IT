package com.plantit.dal.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "created_by")
public class CreatedBy {

    @EmbeddedId
    CreatedByKey id;

    @ManyToOne
    @MapsId("idPlantReference")
    @JoinColumn(name = "PlantReference_idPlantReference")
    PlantReference plantReference;

    @ManyToOne
    @MapsId("idUser")
    @JoinColumn(name = "User_idUser")
    User user;

    @Column(name = "orderNum")
    private int orderNum;

    @Column(name = "updateDate")
    private Date updateDate;


    /***** GETTER & SETTER *****/

    public CreatedByKey getId() {
        return id;
    }

    public void setId(CreatedByKey id) {
        this.id = id;
    }

    public PlantReference getPlantReference() {
        return plantReference;
    }

    public void setPlantReference(PlantReference plantReference) {
        this.plantReference = plantReference;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public CreatedBy(PlantReference PlantReference, User user, int orderNum, Date updateDate) {
        super();
        this.plantReference = PlantReference;
        this.user = user;
        this.orderNum = orderNum;
        this.updateDate = updateDate;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "CreatedBy [idPlantReference" + plantReference.getIdPlantReference() + "userIdUser=" + user.getIdUser()
                + ", orderNum=" + orderNum + "updateDate" + updateDate + "]";
    }

}