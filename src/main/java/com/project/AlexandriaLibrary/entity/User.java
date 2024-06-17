package com.project.AlexandriaLibrary.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDUSER")
    private long idUser;

    @Column(name = "FULL_NAME", nullable = false, length = 50)
    private String fullName;

    @Column(name = "USERNAME", nullable = false, length = 255)
    private String userName;

    @Column(name = "USER_PASSWORD", length = 255, nullable = false)
    private String userPassword;

    @CPF
    @Column(name = "CPF", unique = true, length = 11)
    private String cpf;

    @Column(name = "EMAIL", length = 255, nullable = false, unique = true)
    private String email;

    @Column(name = "PHONE", nullable = false, unique = true)
    private String phone;

    @Column(name = "BIRTH", nullable = false)
    private Date birth;

    @Column(name = "REGISTRATIONDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;

    @OneToMany(mappedBy = "user")
    private Set<UserBook> userBooks;

    public User() {

    }

    public User(long idUser, String fullName, String userName, String userPassword, String cpf, String email, String phone, Date birth, Date registrationDate, Set<UserBook> userBooks) {
        this.idUser = idUser;
        this.fullName = fullName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
        this.birth = birth;
        this.registrationDate = registrationDate;
        this.userBooks = userBooks;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public @CPF String getCpf() {
        return cpf;
    }

    public void setCpf(@CPF String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Set<UserBook> getUserBooks() {
        return userBooks;
    }

    public void setUserBooks(Set<UserBook> userBooks) {
        this.userBooks = userBooks;
    }
}


