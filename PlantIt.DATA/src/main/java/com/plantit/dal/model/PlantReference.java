package com.plantit.dal.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "plantreference")
public class PlantReference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPlantReference")
    private Long idPlantReference;

    @Column(name = "family")
    private String family;

    @Column(name = "size")
    private int size;

    @Column(name = "foodSource")
    private String foodSource;

    @Column(name = "reproduction")
    private String reproduction;

    @Column(name = "lifetime")
    private int lifetime;

    @Column(name = "placeLife")
    private String placeLife;

    @OneToMany(mappedBy = "CreatedBy")
    Set<User> user;

    @ManyToMany(mappedBy = "referencedPicture")
    Set<PictureReference> pictureReferenceCollection;


    /***** GETTER & SETTER *****/

    public Long getIdPlantReference() {
        return idPlantReference;
    }

    public void setIdPlantReference(Long idPlantReference) {
        this.idPlantReference = idPlantReference;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFoodSource() {
        return foodSource;
    }

    public void setFoodSource(String foodSource) {
        this.foodSource = foodSource;
    }

    public String getReproduction() {
        return reproduction;
    }

    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    public String getPlaceLife() {
        return placeLife;
    }

    public void setPlaceLife(String placeLife) {
        this.placeLife = placeLife;
    }

    public Set<PictureReference> getPictureReferenceCollection() {
        return pictureReferenceCollection;
    }

    public void setPictureReferenceCollection(Set<PictureReference> pictureReferenceCollection) {
        this.pictureReferenceCollection = pictureReferenceCollection;
    }

    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }


    /***** CONSTRUCTOR *****/

    public PlantReference() {

    }

    public PlantReference(String family, int size, String foodSource, String reproduction, int lifetime, String placeLife) {
        super();
        this.family = family;
        this.size = size;
        this.foodSource = foodSource;
        this.reproduction = reproduction;
        this.lifetime = lifetime;
        this.placeLife = placeLife;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "PlantReference [family=" + family + ", size=" + size + "foodSource=" + foodSource + ", reproduction=" + reproduction +
                "lifetime=" + lifetime + ", placeLife=" + placeLife + "]";
    }

}