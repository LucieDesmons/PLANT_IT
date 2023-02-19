package com.plantit.dto;

import java.util.List;

public class UserDTO {

    private Long idUser;
    private String name;
    private String firstName;
    private String phone;
    private String email;
    private String login;
    private String password;
    private String degree;
    private String specialization;
    private String hobbies;
    private AddressDTO address;
    private UserDTO godFather;
    private UserTypeDTO userType;
    private List<ConversationDTO> conversationCollection;
    private List<UserHistoricDTO> userHistoricCollection;
    private List<PasswordHistoricDTO> passwordHistoricCollection;
    private List<UserDTO> godFatherCollection;
    private List<MaintenanceDTO> maintenanceCollection;
    private List<CreatedByDTO> createdByCollection;
    private List<PlantDTO> plantCollection;


    /***** GETTER & SETTER *****/

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public UserDTO getGodFather() {
        return godFather;
    }

    public void setGodFather(UserDTO godFather) {
        this.godFather = godFather;
    }

    public UserTypeDTO getUserType() {
        return userType;
    }

    public void setUserType(UserTypeDTO userType) {
        this.userType = userType;
    }

    public List<ConversationDTO> getConversationCollection() {
        return conversationCollection;
    }

    public void setConversationCollection(List<ConversationDTO> conversationCollection) {
        this.conversationCollection = conversationCollection;
    }

    public List<UserHistoricDTO> getUserHistoricCollection() {
        return userHistoricCollection;
    }

    public void setUserHistoricCollection(List<UserHistoricDTO> userHistoricCollection) {
        this.userHistoricCollection = userHistoricCollection;
    }

    public List<PasswordHistoricDTO> getPasswordHistoricCollection() {
        return passwordHistoricCollection;
    }

    public void setPasswordHistoricCollection(List<PasswordHistoricDTO> passwordHistoricCollection) {
        this.passwordHistoricCollection = passwordHistoricCollection;
    }

    public List<UserDTO> getGodFatherCollection() {
        return godFatherCollection;
    }

    public void setGodFatherCollection(List<UserDTO> godFatherCollection) {
        this.godFatherCollection = godFatherCollection;
    }

    public List<MaintenanceDTO> getMaintenanceCollection() {
        return maintenanceCollection;
    }

    public void setMaintenanceCollection(List<MaintenanceDTO> maintenanceCollection) {
        this.maintenanceCollection = maintenanceCollection;
    }

    public List<CreatedByDTO> getCreatedByCollection() {
        return createdByCollection;
    }

    public void setCreatedByCollection(List<CreatedByDTO> createdByCollection) {
        this.createdByCollection = createdByCollection;
    }

    public List<PlantDTO> getPlantCollection() {
        return plantCollection;
    }

    public void setPlantCollection(List<PlantDTO> plantCollection) {
        this.plantCollection = plantCollection;
    }


    /***** CONSTRUCTOR *****/

    public UserDTO() {
    }

}
