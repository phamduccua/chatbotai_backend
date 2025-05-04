package com.example.chatbotai_backend.service.impl;

import com.example.chatbotai_backend.convert.MonHocConvert;
import com.example.chatbotai_backend.model.dto.MonHocDTO;
import com.example.chatbotai_backend.repository.MonHocRepository;
import com.example.chatbotai_backend.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonHocServiceImpl implements MonHocService {
    @Autowired
    private MonHocRepository monHocRepository;
    @Autowired
    private MonHocConvert monHocConvert;
    @Override
    public void addMonHoc(MonHocDTO monHocDTO) {
        monHocRepository.save(monHocConvert.toMonHocEntity(monHocDTO));
    }

    @Override
    public void updateMonHoc(MonHocDTO monHocDTO) {
        if(monHocDTO.getId() == null){
            throw new IllegalArgumentException("ID của môn học không được để trống");
        }
        monHocRepository.save(monHocConvert.toMonHocEntity(monHocDTO));
    }

    @Override
    public void deleteMonHoc(List<Integer> ids) {
        monHocRepository.deleteByIdIn(ids);
    }
}
