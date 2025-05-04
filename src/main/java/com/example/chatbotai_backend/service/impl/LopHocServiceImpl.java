package com.example.chatbotai_backend.service.impl;

import com.example.chatbotai_backend.convert.LopHocConvert;
import com.example.chatbotai_backend.model.dto.LopHocDTO;
import com.example.chatbotai_backend.repository.LopHocRepository;
import com.example.chatbotai_backend.service.LopHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LopHocServiceImpl implements LopHocService {
    @Autowired
    private LopHocRepository lopHocRepository;
    @Autowired
    private LopHocConvert lopHocConvert;
    @Override
    public void addLopHoc(LopHocDTO lopHocDTO) {
        lopHocRepository.save(lopHocConvert.toLopHocEntity(lopHocDTO));
    }

    @Override
    public void updateLopHoc(LopHocDTO lopHocDTO) {
        if(lopHocDTO.getId() == null){
            throw new IllegalArgumentException("ID của lớp học không được để trống");
        }
        lopHocRepository.save(lopHocConvert.toLopHocEntity(lopHocDTO));
    }

    @Override
    public void deleteLopHoc(List<Integer> ids) {
        lopHocRepository.deleteByIdIn(ids);
    }
}
