package com.training.sharevideoversion2.service;

import com.training.sharevideoversion2.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User findUserByUsername(String username);
    void save(User user);
    void delete(User user);
}
