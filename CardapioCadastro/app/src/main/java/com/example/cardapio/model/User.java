package com.example.cardapio.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class User {
    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;

    @SerializedName("password")
    private String password;

    @SerializedName("cpf")
    private String cpf;

    @SerializedName("birth_date")
    private String birth_date;

    public User(){

    }



    public User(String name, String email, String password, String birth_date, String cpf) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.birth_date = birth_date;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCpf() {
        return cpf;
    }

    public String getBirth_date() {
        return birth_date;
    }
}
