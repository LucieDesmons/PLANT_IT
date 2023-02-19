package com.plantit.dto;

import java.util.List;

public class UserTypeDTO {

    private Long idUserType;
    private String label;
    private List<UserDTO> userCollection;


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

    public List<UserDTO> getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(List<UserDTO> userCollection) {
        this.userCollection = userCollection;
    }


    /***** CONSTRUCTOR *****/

    public UserTypeDTO() {
    }

}
