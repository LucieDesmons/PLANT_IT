package com.plantit.dal.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser")
    private Long idUser;

    @Column(name = "name")
    private String name;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "degree")
    private String degree;

    @Column(name = "specialization")
    private String specialization;

    @Column(name = "hobbies")
    private String hobbies;

    @Id
    @Column(name = "idGodfather")
    private int idGodfather;

    @Id
    @Column(name = "Address")
    private int address;

    @Id
    @Column(name = "UserType_idUserType")
    private int userTypeIdUserType;


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

    public int getIdGodfather() {
        return idGodfather;
    }

    public void setIdGodfather(int idGodfather) {
        this.idGodfather = idGodfather;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getUserTypeIdUserType() {
        return userTypeIdUserType;
    }

    public void setUserTypeIdUserType(int userTypeIdUserType) {
        this.userTypeIdUserType = userTypeIdUserType;
    }


    /***** CONSTRUCTOR *****/

    public User() {

    }

    public User(String name, String firstName, String phone, String email, String login, String password, String degree,
                String specialization, String hobbies, int idGodfather, int address, int userTypeIdUserType) {
        super();
        this.name = name;
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
        this.login = login;
        this.password = password;
        this.degree = degree;
        this.specialization = specialization;
        this.hobbies = hobbies;
        this.idGodfather = idGodfather;
        this.address = address;
        this.userTypeIdUserType = userTypeIdUserType;
    }


    /***** TO STRING *****/

    @Override
    public String toString() {
        return "User [name=" + name + ", firstName=" + firstName + ", phone=" + phone +
                "email=" + email + ", login=" + login + ", password=" + password +
                "degree=" + degree + ", specialization=" + specialization + ", hobbies=" + hobbies +
                "idGodfather=" + idGodfather + ", address=" + address + ", userTypeIdUserType=" + userTypeIdUserType +"]";
    }

}