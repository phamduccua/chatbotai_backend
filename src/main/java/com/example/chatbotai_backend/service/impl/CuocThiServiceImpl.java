package com.example.chatbotai_backend.service.impl;

import com.example.chatbotai_backend.convert.CuocThiConvert;
import com.example.chatbotai_backend.model.dto.CuocThiDTO;
import com.example.chatbotai_backend.repository.CuocThiRepository;
import com.example.chatbotai_backend.service.CuocThiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuocThiServiceImpl implements CuocThiService {
    @Autowired
    private CuocThiRepository cuocThiRepository;
    @Autowired
    private CuocThiConvert cuocThiConvert;
    @Override
    public void addCuocThi(CuocThiDTO cuocThiDTO) {
        cuocThiRepository.save(cuocThiConvert.toCuocThiEntity(cuocThiDTO));
    }

    @Override
    public void updateCuocThi(CuocThiDTO cuocThiDTO) {
        if(cuocThiDTO.getId() == null){
            throw new IllegalArgumentException("ID của cuộc thi không được để trống");
        }
        cuocThiRepository.save(cuocThiConvert.toCuocThiEntity(cuocThiDTO));
    }

    @Override
    public void deleteCuocThi(List<Integer> ids) {
        cuocThiRepository.deleteByIdIn(ids);
    }
}
