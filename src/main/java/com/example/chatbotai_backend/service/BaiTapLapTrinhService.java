package com.example.chatbotai_backend.service;

import com.example.chatbotai_backend.model.dto.AbstractDTO;
import com.example.chatbotai_backend.model.dto.BaiTapLapTrinhDTO;
import com.example.chatbotai_backend.model.response.BaiTapLapTrinhResponse;
import com.example.chatbotai_backend.model.response.CodeAndNameAndLevelBaiLapTrinh;

import java.util.List;

public interface BaiTapLapTrinhService {
    void addBaiTapLapTrinh(BaiTapLapTrinhDTO baiTapLapTrinhDTO);
    void updateBaiTapLapTrinh(BaiTapLapTrinhDTO baiTapLapTrinhDTO);
    void deleteBaiTapLapTrinh(List<Integer> ids);
    List<CodeAndNameAndLevelBaiLapTrinh> findByIdBaiThucHanh(Integer idBaiThucHanh);
    BaiTapLapTrinhResponse findByMa(String ma);
    AbstractDTO find();
}
