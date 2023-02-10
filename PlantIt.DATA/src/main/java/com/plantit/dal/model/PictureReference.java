package com.plantit.dal.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

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

    @ManyToMany
    @JoinTable(
        name = "referencedPicture",
        joinColumns = @JoinColumn(name = "PlantReference_idPlantReference"),
        inverseJoinColumns = @JoinColumn(name = "PictureReference_idPictureReference")
    )
    Set<PlantReference> plantReferenceCollection;


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

    public Set<PlantReference> getPlantReferenceCollection() {
        return plantReferenceCollection;
    }

    public void setPlantReferenceCollection(Set<PlantReference> plantReferenceCollection) {
        this.plantReferenceCollection = plantReferenceCollection;
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