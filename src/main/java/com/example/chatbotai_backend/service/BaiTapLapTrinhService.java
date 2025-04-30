package com.example.chatbotai_backend.service;

import com.example.chatbotai_backend.model.dto.BaiTapLapTrinhDTO;

import java.util.List;

public interface BaiTapLapTrinhService {
    void addBaiTapLapTrinh(BaiTapLapTrinhDTO baiTapLapTrinhDTO);
    void updateBaiTapLapTrinh(BaiTapLapTrinhDTO baiTapLapTrinhDTO);
    void deleteBaiTapLapTrinh(List<Integer> ids);
}
