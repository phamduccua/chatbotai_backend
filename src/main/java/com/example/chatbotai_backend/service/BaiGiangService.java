package com.example.chatbotai_backend.service;

import com.example.chatbotai_backend.model.dto.BaiGiangDTO;
import com.example.chatbotai_backend.model.response.BaiGiangResponse;

import java.util.List;

public interface BaiGiangService {
    void addBaiGiang(BaiGiangDTO baiGiangDTO);
    void updateBaiGiang(BaiGiangDTO baiGiangDTO);
    void deleteBaiGiang(List<String> ids);
    List<BaiGiangResponse> getBaiGiangByMonHoc(Integer id);
    BaiGiangResponse searchBaiGiangById(String id);
}
