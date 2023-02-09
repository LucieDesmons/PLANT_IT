package com.plantit.dal.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "picturereference")
public class PictureReference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPictureReference")
    private Long idPictureReference;

    @Column(name = "way")
    private String way;

    @Column(name = "modificationDate")
    private Date modificationDate;


    /***** GETTER & SETTER *****/

    public Long getIdPictureReference() {
        return idPictureReference;
    }

    public void setIdPictureReference(Long idPictureReference) {
        this.idPictureReference = idPictureReference;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }


    /***** CONSTRUCTOR *****/

    public PictureReference() {

    }

    public PictureReference(String way, Date modificationDate) {
        super();
        this.way = way;
        this.modificationDate = modificationDate;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "Picture [way=" + way + ", modificationDate=" + modificationDate + "]";
    }

}