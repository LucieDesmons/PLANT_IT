package com.plantit.dal.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usertype")
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUserType")
    private Long idUserType;

    @Column(name = "label")
    private String label;


    /***** GETTER & SETTER *****/

    public Long getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(Long idUserType) {
        this.idUserType = idUserType;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    /***** CONSTRUCTOR *****/

    public UserType() {

    }

    public UserType(String label) {
        super();
        this.label = label;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "UserType [label=" + label + "]";
    }

}