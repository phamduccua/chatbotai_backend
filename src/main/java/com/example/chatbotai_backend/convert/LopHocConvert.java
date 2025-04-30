package com.example.chatbotai_backend.convert;

import com.example.chatbotai_backend.entity.LopHocEntity;
import com.example.chatbotai_backend.entity.MonHocEntity;
import com.example.chatbotai_backend.model.dto.LopHocDTO;
import com.example.chatbotai_backend.repository.MonHocRepository;
import com.example.chatbotai_backend.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LopHocConvert {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private MonHocRepository monHocRepository;
    @Autowired
    private UserRepository userRepository;

    public LopHocEntity toLopHocEntity(LopHocDTO lopHocDTO) {
        LopHocEntity lopHocEntity = modelMapper.map(lopHocDTO, LopHocEntity.class);
        MonHocEntity monhoc = monHocRepository.findById(lopHocDTO.getIdMonHoc()).get();
        lopHocEntity.setMonHoc(monhoc);
        lopHocEntity.setGiangVien(userRepository.findById(lopHocDTO.getIdGiangVien()).get());
        return lopHocEntity;
    }
}
