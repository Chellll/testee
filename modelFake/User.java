package com.example.mazito_game.modelFake;

public class User {

    private String name;
    private String email;
    private String password;
    private int monet;
    private String phone;

    public User(String name, String email, String password, int monet, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.monet = monet;
        this.phone = phone;
    }

    public User(){

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

    public int getMonet() {
        return monet;
    }

    public void setMonet(int monet) {
        this.monet = monet;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
