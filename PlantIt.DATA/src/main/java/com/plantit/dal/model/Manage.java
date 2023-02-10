package com.plantit.dal.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "manage")
public class Manage {

    @EmbeddedId
    ManageKey idManage;

    @ManyToOne
    @MapsId("idUser")
    @JoinColumn(name = "User_idCustomer")
    User userIdCustomer;

    @ManyToOne
    @MapsId("idUser")
    @JoinColumn(name = "User_idBotanist")
    User userIdBotanist;

    @Column(name = "Start_date")
    private Date startDate;

    @Column(name = "End_date")
    private Date endDate;


    /***** GETTER & SETTER *****/

    public ManageKey getIdManage() {
        return idManage;
    }

    public void setIdManage(ManageKey idManage) {
        this.idManage = idManage;
    }

    public User getUserIdCustomer() {
        return userIdCustomer;
    }

    public void setUserIdCustomer(User userIdCustomer) {
        this.userIdCustomer = userIdCustomer;
    }

    public User getUserIdBotanist() {
        return userIdBotanist;
    }

    public void setUserIdBotanist(User userIdBotanist) {
        this.userIdBotanist = userIdBotanist;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    /***** CONSTRUCTOR *****/

    public Manage() {

    }

    public Manage(User userIdCustomer, User userIdBotanist, Date startDate, Date endDate) {
        super();
        this.userIdCustomer = userIdCustomer;
        this.userIdBotanist = userIdBotanist;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "Manage [userIdCustomer" + userIdCustomer.getIdUser() + "userIdBotanist=" + userIdBotanist.getIdUser() + "startDate" + startDate + "endDate=" + endDate +"]";
    }

}