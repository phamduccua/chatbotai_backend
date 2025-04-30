package com.example.chatbotai_backend.service;

import com.example.chatbotai_backend.model.dto.CuocThiDTO;

import java.util.List;

public interface CuocThiService {
    void addCuocThi(CuocThiDTO cuocThiDTO);
    void updateCuocThi(CuocThiDTO cuocThiDTO);
    void deleteCuocThi(List<Integer> ids);
}
