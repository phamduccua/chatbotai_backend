package com.example.chatbotai_backend.service;

import com.example.chatbotai_backend.model.dto.BaiTapLapTrinhDTO;
import com.example.chatbotai_backend.model.dto.BaiTapTracNghiemDTO;

import java.util.List;

public interface BaiTapTracNghiemService {
    void addBaiTapTracNghiem(BaiTapTracNghiemDTO baiTapTracNghiemDTO);
    void updateBaiTapTracNghiem(BaiTapTracNghiemDTO baiTapTracNghiemDTO);
    void deleteBaiTapTracNghiem(List<String> ids);
}
