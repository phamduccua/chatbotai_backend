package com.example.chatbotai_backend.convert;

import com.example.chatbotai_backend.entity.BaiThucHanhEntity;
import com.example.chatbotai_backend.model.dto.BaiThucHanhDTO;
import com.example.chatbotai_backend.model.response.BaiTapLapTrinhResponse;
import com.example.chatbotai_backend.model.response.BaiThucHanhResponse;
import com.example.chatbotai_backend.repository.MonHocRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaiThucHanhConvert {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private MonHocRepository monHocRepository;
    public BaiThucHanhEntity toBaiThucHanhEntity(BaiThucHanhDTO baiThucHanhDTO) {
        BaiThucHanhEntity cuocThiEntity = modelMapper.map(baiThucHanhDTO, BaiThucHanhEntity.class);
        cuocThiEntity.setMonHoc(monHocRepository.findById(baiThucHanhDTO.getIdMonHoc()).get());
        return cuocThiEntity;
    }

    public BaiThucHanhResponse toBaiThucHanhResponse(BaiThucHanhEntity baiThucHanhEntity) {
        BaiThucHanhResponse baiThucHanhResponse = modelMapper.map(baiThucHanhEntity, BaiThucHanhResponse.class);
        return baiThucHanhResponse;
    }
}
