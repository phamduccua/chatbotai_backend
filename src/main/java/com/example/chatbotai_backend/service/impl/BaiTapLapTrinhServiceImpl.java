package com.example.chatbotai_backend.service.impl;


import com.example.chatbotai_backend.convert.BaiTapLapTrinhConvert;
import com.example.chatbotai_backend.model.dto.BaiTapLapTrinhDTO;
import com.example.chatbotai_backend.repository.BaiTapLapTrinhRepository;
import com.example.chatbotai_backend.service.BaiTapLapTrinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaiTapLapTrinhServiceImpl implements BaiTapLapTrinhService {
    @Autowired
    private BaiTapLapTrinhRepository baiTapLapTrinhRepository;
    @Autowired
    private BaiTapLapTrinhConvert baiTapLapTrinhConvert;
    @Override
    public void addBaiTapLapTrinh(BaiTapLapTrinhDTO baiTapLapTrinhDTO) {
        baiTapLapTrinhRepository.save(baiTapLapTrinhConvert.toBaiTapLapTrinhEntity(baiTapLapTrinhDTO));
    }

    @Override
    public void updateBaiTapLapTrinh(BaiTapLapTrinhDTO baiTapLapTrinhDTO) {
        baiTapLapTrinhRepository.save(baiTapLapTrinhConvert.toBaiTapLapTrinhEntity(baiTapLapTrinhDTO));
    }

    @Override
    public void deleteBaiTapLapTrinh(List<Integer> ids) {
        baiTapLapTrinhRepository.deleteByIdIn(ids);
    }
}
