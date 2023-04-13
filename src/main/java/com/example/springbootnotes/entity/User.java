package com.example.springbootnotes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "spring_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    
    @Pattern(regexp = "^[a-z0-9]{7,20}$", message = "Username should only contains of lowercase letters and numberic characters, with minimum of 7 and maximum of 20 characters respectively")
    private String username;

    private String password;

    @NotBlank(message = "Display name must not be blank")
    private String displayName;

    public User() {
    }

    public User(Long userId, String username, String password, String displayName) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.displayName = displayName;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}
