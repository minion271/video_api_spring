package com.training.sharevideoversion2.dto;

public class UserDTO {
    private String username;
    private String password;
    private String token;
    private String role;

    public UserDTO() {
    }

    public UserDTO(String token, String username, String role) {
        this.token=token;
        this.username=username;
        this.role=role;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
