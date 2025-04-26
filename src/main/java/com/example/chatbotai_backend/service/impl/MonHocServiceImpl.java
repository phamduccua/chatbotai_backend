package com.example.chatbotai_backend.service.impl;

import com.example.chatbotai_backend.convert.MonHocConvert;
import com.example.chatbotai_backend.model.dto.MonHocDTO;
import com.example.chatbotai_backend.repository.MonHocRepository;
import com.example.chatbotai_backend.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
