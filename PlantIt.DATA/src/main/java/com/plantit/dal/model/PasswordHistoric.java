package com.plantit.dal.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "passwordhistoric")
public class PasswordHistoric {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHistoric")
    private Long idHistoric;

    @Column(name = "password")
    private String password;

    @Column(name = "updateDate")
    private Date updateDate;

    @Column(name = "User_idUser")
    private int userIdUser;


    /***** GETTER & SETTER *****/

    public Long getIdHistoric() {
        return idHistoric;
    }

    public void setIdHistoric(Long idHistoric) {
        this.idHistoric = idHistoric;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(int userIdUser) {
        this.userIdUser = userIdUser;
    }


    /***** CONSTRUCTOR *****/

    public PasswordHistoric() {

    }

    public PasswordHistoric(String password, Date updateDate, int userIdUser) {
        super();
        this.password = password;
        this.updateDate = updateDate;
        this.userIdUser = userIdUser;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "PasswordHistoric [password=" + password + ", updateDate=" + updateDate + ", userIdUser=" + userIdUser + "]";
    }

}