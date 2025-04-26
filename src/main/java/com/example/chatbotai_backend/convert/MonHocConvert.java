package com.example.chatbotai_backend.convert;

import com.example.chatbotai_backend.entity.MonHocEntity;
import com.example.chatbotai_backend.model.dto.MonHocDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MonHocConvert {
    @Autowired
    private ModelMapper modelMapper;

    public MonHocEntity toMonHocEntity(MonHocDTO monHocDTO) {
        MonHocEntity monHocEntity = modelMapper.map(monHocDTO, MonHocEntity.class);
        return monHocEntity;
    }
}
