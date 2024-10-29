package com.eventbook.userservice.domain.models;

import jakarta.persistence.*;

@Entity
@Table(name = "app_user")  // Add this line
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;

    // Constructor
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public User() {

    }

    // Getters and setters
    public Long getId() {
        return id;
    }

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