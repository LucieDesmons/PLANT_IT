package com.plantit.dal.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "manage")
public class Manage {

    @Id
    @Column(name = "User_idCustomer")
    private int userIdCustomer;

    @Id
    @Column(name = "User_idBotanist")
    private int userIdBotanist;

    @Column(name = "Start_date")
    private Date startDate;

    @Column(name = "End_date")
    private Date endDate;


    /***** GETTER & SETTER *****/

    public int getUserIdCustomer() {
        return userIdCustomer;
    }

    public void setUserIdCustomer(int userIdCustomer) {
        this.userIdCustomer = userIdCustomer;
    }

    public int getUserIdBotanist() {
        return userIdBotanist;
    }

    public void setUserIdBotanist(int userIdBotanist) {
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

    public Manage(int userIdCustomer, int userIdBotanist, Date startDate, Date endDate) {
        super();
        this.userIdCustomer = userIdCustomer;
        this.userIdBotanist = userIdBotanist;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "Manage [userIdCustomer" + userIdCustomer + "userIdBotanist=" + userIdBotanist + "startDate" + startDate + "endDate=" + endDate +"]";
    }

}