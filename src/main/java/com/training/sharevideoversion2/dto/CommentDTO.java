package com.training.sharevideoversion2.dto;

import com.training.sharevideoversion2.entity.User;

import java.sql.Timestamp;

public class CommentDTO {
    private long id;
    private String message;
    private Timestamp gen_time;
    private String user_username;

    public CommentDTO() {
    }

    public CommentDTO(long id, String message, Timestamp gen_time, String user_username) {
        this.id = id;
        this.message = message;
        this.gen_time = gen_time;
        this.user_username = user_username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getGen_time() {
        return gen_time;
    }

    public void setGen_time(Timestamp gen_time) {
        this.gen_time = gen_time;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }
}
