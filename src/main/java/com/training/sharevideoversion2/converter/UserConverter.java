package com.training.sharevideoversion2.converter;

import com.training.sharevideoversion2.dto.UserDTO;
import com.training.sharevideoversion2.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserDTO convertToUserDto(User user){
        UserDTO userDTO=new UserDTO();
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setRole(user.getRole());
        return userDTO;
    }
}
