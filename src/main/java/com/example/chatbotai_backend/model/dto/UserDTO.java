package com.example.chatbotai_backend.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDTO {
    private Integer Id;
    private String username;
    private String fullname;
    private String email;
    private String address;
    private String password;
    private String role;
    private Integer status;
    private List<LopHocDTO> lopHocDTOList;
}
