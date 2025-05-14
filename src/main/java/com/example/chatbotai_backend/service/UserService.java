package com.example.chatbotai_backend.service;

import com.example.chatbotai_backend.model.dto.LopHocDTO;
import com.example.chatbotai_backend.model.dto.UserDTO;

import java.util.List;
import java.util.Optional;


public interface UserService {
    void addUser(UserDTO userDTO);
    void updatePassword(Integer id, String newPassword);
    Optional<UserDTO> getUserByEmail(String email);
    List<LopHocDTO> getLopHocById(Integer id);
}
