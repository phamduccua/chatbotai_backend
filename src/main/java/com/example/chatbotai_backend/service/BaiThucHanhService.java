package com.example.chatbotai_backend.service;

import com.example.chatbotai_backend.model.dto.AbstractDTO;
import com.example.chatbotai_backend.model.dto.BaiThucHanhDTO;

import java.util.List;

public interface BaiThucHanhService {
    void addBaiThucHanh(BaiThucHanhDTO baiThucHanhDTO);
    void updateBaiThucHanh(BaiThucHanhDTO baiThucHanhDTO);
    void deleteBaiThucHanh(List<Integer> ids);
    AbstractDTO getBaiThucHanh();
}
