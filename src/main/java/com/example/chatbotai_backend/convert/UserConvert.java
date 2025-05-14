package com.example.chatbotai_backend.convert;

import com.example.chatbotai_backend.entity.UserEntity;
import com.example.chatbotai_backend.model.dto.UserDTO;
import com.example.chatbotai_backend.model.response.UserResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserConvert {
    @Autowired
    private ModelMapper modelMapper;

    public UserEntity toUserEntity(UserDTO userDTO){
        UserEntity userEntity = modelMapper.map(userDTO, UserEntity.class);
        return userEntity;
    }

    public UserResponse toUserResponse(UserEntity userEntity){
        UserResponse userResponse = modelMapper.map(userEntity, UserResponse.class);
        return userResponse;
    }
}
