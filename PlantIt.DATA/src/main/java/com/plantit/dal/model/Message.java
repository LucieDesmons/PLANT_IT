package com.plantit.dal.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMessage")
    private Long idMessage;

    @Column(name = "label")
    private String label;

    @Column(name = "updateDate")
    private Date updateDate;

    @Column(name = "Conversation_idConversation")
    private int conversationIdConversation;


    /***** GETTER & SETTER *****/

    public Long getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Long idMessage) {
        this.idMessage = idMessage;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getConversationIdConversation() {
        return conversationIdConversation;
    }

    public void setConversationIdConversation(int conversationIdConversation) {
        this.conversationIdConversation = conversationIdConversation;
    }


    /***** CONSTRUCTOR *****/

    public Message() {

    }

    public Message(String label, Date updateDate, int conversationIdConversation) {
        super();
        this.label = label;
        this.updateDate = updateDate;
        this.conversationIdConversation = conversationIdConversation;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "Message [label=" + label + ", updateDate=" + updateDate + ", conversationIdConversation=" + conversationIdConversation + "]";
    }

}