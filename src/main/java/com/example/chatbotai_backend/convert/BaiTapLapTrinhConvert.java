package com.example.chatbotai_backend.convert;

import com.example.chatbotai_backend.entity.BaiTapLapTrinhEntity;
import com.example.chatbotai_backend.model.dto.BaiTapLapTrinhDTO;
import com.example.chatbotai_backend.repository.CuocThiRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaiTapLapTrinhConvert {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CuocThiRepository cuocThiRepository;

    public BaiTapLapTrinhEntity toBaiTapLapTrinhEntity(BaiTapLapTrinhDTO baiTapLapTrinhDTO) {
        BaiTapLapTrinhEntity baiTapLapTrinhEntity = modelMapper.map(baiTapLapTrinhDTO, BaiTapLapTrinhEntity.class);
        baiTapLapTrinhEntity.setCuocThiEntity(cuocThiRepository.findById(baiTapLapTrinhDTO.getIdCuocThi()).get());
        return baiTapLapTrinhEntity;
    }
}
