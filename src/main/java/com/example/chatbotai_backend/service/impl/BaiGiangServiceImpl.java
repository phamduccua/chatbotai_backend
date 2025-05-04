package com.example.chatbotai_backend.service.impl;

import com.example.chatbotai_backend.convert.BaiGiangConvert;
import com.example.chatbotai_backend.entity.BaiGiangEntity;
import com.example.chatbotai_backend.model.dto.BaiGiangDTO;
import com.example.chatbotai_backend.model.response.BaiGiangResponse;
import com.example.chatbotai_backend.repository.BaiGiangRepository;
import com.example.chatbotai_backend.service.BaiGiangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BaiGiangServiceImpl implements BaiGiangService {
    @Autowired
    private BaiGiangRepository baiGiangRepository;
    @Autowired
    private BaiGiangConvert baiGiangConvert;
    @Override
    public void addBaiGiang(BaiGiangDTO baiGiangDTO) {
        baiGiangRepository.save(baiGiangConvert.toBaiGiangEntity(baiGiangDTO));
    }

    @Override
    public void updateBaiGiang(BaiGiangDTO baiGiangDTO) {
        if(baiGiangDTO.getId() == null || baiGiangDTO.getId().equals("")){
            throw new IllegalArgumentException("ID của bài giảng không được để trống");
        }
        baiGiangRepository.save(baiGiangConvert.toBaiGiangEntity(baiGiangDTO));
    }

    @Override
    public void deleteBaiGiang(List<String> ids) {
        baiGiangRepository.deleteByIdIn(ids);
    }

    @Override
    public List<BaiGiangResponse> getBaiGiangByMonHoc(Integer id) {
        List<BaiGiangEntity> baiGiangEntities = baiGiangRepository.findByIdMonHoc(id);
        List<BaiGiangResponse> baiGiangResponses = baiGiangEntities.stream()
                .map(item -> baiGiangConvert.toBaiGiangResponse(item)).collect(Collectors.toList());
        return baiGiangResponses;
    }

    @Override
    public BaiGiangResponse searchBaiGiangById(String id) {
        return baiGiangConvert.toBaiGiangResponse(baiGiangRepository.findById(id).get());
    }

}
