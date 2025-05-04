package com.example.chatbotai_backend.convert;

import com.example.chatbotai_backend.entity.BaiGiangEntity;
import com.example.chatbotai_backend.model.dto.BaiGiangDTO;
import com.example.chatbotai_backend.model.response.BaiGiangResponse;
import com.example.chatbotai_backend.repository.MonHocRepository;
import com.example.chatbotai_backend.service.BaiGiangService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public class BaiGiangConvert {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private MonHocRepository monHocRepository;

    public BaiGiangEntity toBaiGiangEntity(BaiGiangDTO baiGiangDTO) {
        BaiGiangEntity baiGiangEntity = modelMapper.map(baiGiangDTO, BaiGiangEntity.class);
        return baiGiangEntity;
    }

    public BaiGiangResponse toBaiGiangResponse(BaiGiangEntity baiGiangEntity) {
        BaiGiangResponse baiGiangResponse = modelMapper.map(baiGiangEntity, BaiGiangResponse.class);
        baiGiangResponse.setTenMonHoc(monHocRepository.findById(baiGiangEntity.getIdMonHoc()).get().getTen());
        return baiGiangResponse;
    }
}
