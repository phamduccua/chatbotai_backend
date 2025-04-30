package com.example.chatbotai_backend.convert;

import com.example.chatbotai_backend.entity.CuocThiEntity;
import com.example.chatbotai_backend.model.dto.CuocThiDTO;
import com.example.chatbotai_backend.repository.MonHocRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CuocThiConvert {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private MonHocRepository monHocRepository;
    public CuocThiEntity toCuocThiEntity(CuocThiDTO cuocThiDTO) {
        CuocThiEntity cuocThiEntity = modelMapper.map(cuocThiDTO, CuocThiEntity.class);
        cuocThiEntity.setMonHoc(monHocRepository.findById(cuocThiDTO.getIdMonHoc()).get());
        return cuocThiEntity;
    }
}
