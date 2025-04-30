package com.example.chatbotai_backend.service;

import com.example.chatbotai_backend.model.dto.LopHocDTO;

import java.util.List;

public interface LopHocService {
    void addLopHoc(LopHocDTO lopHocDTO);
    void updateLopHoc(LopHocDTO lopHocDTO);
    void deleteLopHoc(List<Integer> ids);
}
