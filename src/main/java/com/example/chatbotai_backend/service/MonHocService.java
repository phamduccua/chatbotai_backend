package com.example.chatbotai_backend.service;

import com.example.chatbotai_backend.model.dto.MonHocDTO;

import java.util.List;

public interface MonHocService {
    void addMonHoc(MonHocDTO monHocDTO);
    void updateMonHoc(MonHocDTO monHocDTO);
    void deleteMonHoc(List<Integer> ids);
}
