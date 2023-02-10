package com.plantit.dal.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "userhistoric")
public class UserHistoric {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUserHistoric")
    private Long idUserHistoric;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @Id
    @Column(name = "User_idUser")
    private int userIdUser;


    /***** GETTER & SETTER *****/

    public Long getIdUserHistoric() {
        return idUserHistoric;
    }

    public void setIdUserHistoric(Long idUserHistoric) {
        this.idUserHistoric = idUserHistoric;
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

    public int getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(int userIdUser) {
        this.userIdUser = userIdUser;
    }


    /***** CONSTRUCTOR *****/

    public UserHistoric() {

    }

    public UserHistoric(Date startDate, Date endDate, int userIdUser) {
        super();
        this.startDate = startDate;
        this.endDate = endDate;
        this.userIdUser = userIdUser;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "UserHistoric [startDate=" + startDate + ", endDate=" + endDate + ", userIdUser=" + userIdUser + "]";
    }

}