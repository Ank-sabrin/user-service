package com.eventbook.userservice.presentation.dto;

public class UserUpdateDTO {
    private String username;
    private String email;

    // Default constructor
    public UserUpdateDTO() {}

    // Constructor with all fields
    public UserUpdateDTO(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}