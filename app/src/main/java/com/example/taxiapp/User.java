package com.example.taxiapp;

public class User {

    private String name;
    private String email;
    private String id;

    public User(){

    }

    public User(String email, String id) {
        this.email = email;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
