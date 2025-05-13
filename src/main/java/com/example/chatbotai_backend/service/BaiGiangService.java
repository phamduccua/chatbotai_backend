package com.example.chatbotai_backend.service;

import com.example.chatbotai_backend.model.dto.BaiGiangDTO;
import com.example.chatbotai_backend.model.response.BaiGiangResponse;
import com.example.chatbotai_backend.model.response.IdAndNameBaiGiang;

import java.util.List;

public interface BaiGiangService {
    void addBaiGiang(BaiGiangDTO baiGiangDTO);
    void updateBaiGiang(BaiGiangDTO baiGiangDTO);
    void deleteBaiGiang(List<String> ids);
    List<IdAndNameBaiGiang> getBaiGiangByMonHoc(Integer id);
    BaiGiangResponse searchBaiGiangById(String id);
}
