package com.example.chatbotai_backend.model.response;

import com.example.chatbotai_backend.entity.LopHocEntity;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class UserResponse {
    private Integer Id;
    private String username;
    private String fullname;
    private String email;
    private String address;
    private String role;
    private Integer status;
    private List<LopHocEntity> lopHocEntityList;
}
