package com.example.demojavafx.model;

public class User {

    // Singleton user
    static private User user = new User();
    private String username;
    private String password;

    private String note;

    private User() {
    }

    static public User getInstance(){
        return user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
