package com.example.chatbotai_backend.service.impl;

import com.example.chatbotai_backend.convert.BaiTapTracNghiemConvert;
import com.example.chatbotai_backend.entity.BaiTapTracNghiemEntity;
import com.example.chatbotai_backend.model.dto.BaiTapTracNghiemDTO;
import com.example.chatbotai_backend.model.response.BaiTapTracNghiemResponse;
import com.example.chatbotai_backend.repository.BaiTapTracNghiemRepository;
import com.example.chatbotai_backend.service.BaiTapTracNghiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaiTapTracNghiemServiceImpl implements BaiTapTracNghiemService {
    @Autowired
    private BaiTapTracNghiemRepository baiTapTracNghiemRepository;
    @Autowired
    private BaiTapTracNghiemConvert baiTapTracNghiemConvert;
    @Override
    public void addBaiTapTracNghiem(BaiTapTracNghiemDTO baiTapTracNghiemDTO) {
        baiTapTracNghiemRepository.save(baiTapTracNghiemConvert.toBaiTapTracNghiemEntity(baiTapTracNghiemDTO));
    }

    @Override
    public void updateBaiTapTracNghiem(BaiTapTracNghiemDTO baiTapTracNghiemDTO) {
        if(baiTapTracNghiemDTO.getId() == null || baiTapTracNghiemDTO.getId().equals("")){
            throw new IllegalArgumentException("ID của bài tập không được để trống");
        }
        baiTapTracNghiemRepository.save(baiTapTracNghiemConvert.toBaiTapTracNghiemEntity(baiTapTracNghiemDTO));
    }

    @Override
    public void deleteBaiTapTracNghiem(List<String> ids) {
        baiTapTracNghiemRepository.deleteByIdIn(ids);
    }

    @Override
    public BaiTapTracNghiemResponse getBaiTapTracNghiem(String id) {
        BaiTapTracNghiemEntity baiTapTracNghiemEntity = baiTapTracNghiemRepository.findById(id).orElse(null);
        return baiTapTracNghiemConvert.toBaiTapTracNghiemResponse(baiTapTracNghiemEntity);
    }
}
