package com.cardapio_mobile.apiCardapioMobile.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "users")
@Table(name = "users")
public class User {

    @Column(name = "uuid", nullable = false, updatable = false, insertable = false)
    private UUID uuid;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "birth_date")
    private String birth_date;


    public User() {

    }

    public User(UUID uuid,Integer id, String name, String email, String password, String cpf, String birth_date) {
        this.uuid = uuid;
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.birth_date = birth_date;
    }

    public UUID getUuid(){
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }
}
