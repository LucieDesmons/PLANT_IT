package com.plantit.dal.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "conversation")
public class Conversation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConversation")
    private Long idConversation;

    @Column(name = "User_id1")
    private int userId1;

    @Column(name = "User_id2")
    private int userId2;

    @ManyToMany(mappedBy = "plantConversation")
    Set<Plant> plantCollection;


    /***** GETTER & SETTER *****/

    public Long getIdConversation() {
        return idConversation;
    }

    public void setIdConversation(Long idConversation) {
        this.idConversation = idConversation;
    }

    public int getUserId1() {
        return userId1;
    }

    public void setUserId1(int userId1) {
        this.userId1 = userId1;
    }

    public int getUserId2() {
        return userId2;
    }

    public void setUserId2(int userId2) {
        this.userId2 = userId2;
    }

    public Set<Plant> getPlantCollection() {
        return plantCollection;
    }

    public void setPlantCollection(Set<Plant> plantCollection) {
        this.plantCollection = plantCollection;
    }


    /***** CONSTRUCTOR *****/

    public Conversation() {

    }

    public Conversation(int userId1, int userId2) {
        super();
        this.userId1 = userId1;
        this.userId2 = userId2;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "Conversation [userId1=" + userId1 + ", userId2=" + userId2 + "]";
    }

}