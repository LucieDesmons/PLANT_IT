package com.plantit.dto;

import java.util.List;

public class ConversationDTO {

    private Long idConversation;
    private UserDTO user1;
    private UserDTO user2;
    private List<MessageDTO> messageCollection;
    private List<PlantDTO> plantCollection;


    /***** GETTER & SETTER *****/

    public Long getIdConversation() {
        return idConversation;
    }

    public void setIdConversation(Long idConversation) {
        this.idConversation = idConversation;
    }

    public UserDTO getUser1() {
        return user1;
    }

    public void setUser1(UserDTO user1) {
        this.user1 = user1;
    }

    public UserDTO getUser2() {
        return user2;
    }

    public void setUser2(UserDTO user2) {
        this.user2 = user2;
    }

    public List<MessageDTO> getMessageCollection() {
        return messageCollection;
    }

    public void setMessageCollection(List<MessageDTO> messageCollection) {
        this.messageCollection = messageCollection;
    }

    public List<PlantDTO> getPlantCollection() {
        return plantCollection;
    }

    public void setPlantCollection(List<PlantDTO> plantCollection) {
        this.plantCollection = plantCollection;
    }


    /***** CONSTRUCTOR *****/

    public ConversationDTO() {
    }

}
