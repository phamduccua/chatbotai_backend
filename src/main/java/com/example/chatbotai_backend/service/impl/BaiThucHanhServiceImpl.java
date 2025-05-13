package com.example.chatbotai_backend.service.impl;

import com.example.chatbotai_backend.convert.BaiThucHanhConvert;
import com.example.chatbotai_backend.entity.BaiThucHanhEntity;
import com.example.chatbotai_backend.model.dto.AbstractDTO;
import com.example.chatbotai_backend.model.dto.BaiThucHanhDTO;
import com.example.chatbotai_backend.model.response.BaiThucHanhResponse;
import com.example.chatbotai_backend.repository.BaiThucHanhRepository;
import com.example.chatbotai_backend.service.BaiThucHanhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BaiThucHanhServiceImpl implements BaiThucHanhService {
    @Autowired
    private BaiThucHanhRepository baiThucHanhRepository;
    @Autowired
    private BaiThucHanhConvert baiThucHanhConvert;
    @Override
    public void addBaiThucHanh(BaiThucHanhDTO baiThucHanhDTO) {
        baiThucHanhRepository.save(baiThucHanhConvert.toBaiThucHanhEntity(baiThucHanhDTO));
    }

    @Override
    public void updateBaiThucHanh(BaiThucHanhDTO baiThucHanhDTO) {
        if(baiThucHanhDTO.getId() == null){
            throw new IllegalArgumentException("ID của bài thực hành không được để trống");
        }
        baiThucHanhRepository.save(baiThucHanhConvert.toBaiThucHanhEntity(baiThucHanhDTO));
    }

    @Override
    public void deleteBaiThucHanh(List<Integer> ids) {
        baiThucHanhRepository.deleteByIdIn(ids);
    }

    @Override
    public AbstractDTO getBaiThucHanh() {
        List<BaiThucHanhEntity> baiThucHanhEntities = baiThucHanhRepository.findAll();
        List<BaiThucHanhResponse> result = baiThucHanhEntities.stream()
                .map(item -> baiThucHanhConvert.toBaiThucHanhResponse(item))
                .collect(Collectors.toList());
        AbstractDTO abstractDTO = new AbstractDTO();
        abstractDTO.setListResult(result);
        return abstractDTO;
    }
}
