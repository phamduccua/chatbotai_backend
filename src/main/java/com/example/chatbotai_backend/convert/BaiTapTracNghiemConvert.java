package com.example.chatbotai_backend.convert;

import com.example.chatbotai_backend.entity.BaiTapTracNghiemEntity;
import com.example.chatbotai_backend.model.dto.BaiTapTracNghiemDTO;
import com.example.chatbotai_backend.model.response.BaiTapLapTrinhResponse;
import com.example.chatbotai_backend.model.response.BaiTapTracNghiemResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaiTapTracNghiemConvert {
    @Autowired
    private ModelMapper modelMapper;

    public BaiTapTracNghiemEntity toBaiTapTracNghiemEntity(BaiTapTracNghiemDTO baiTapTracNghiemDTO) {
        BaiTapTracNghiemEntity baiTapTracNghiemEntity = modelMapper.map(baiTapTracNghiemDTO, BaiTapTracNghiemEntity.class);
        return baiTapTracNghiemEntity;
    }

    public BaiTapTracNghiemResponse toBaiTapTracNghiemResponse(BaiTapTracNghiemEntity baiTapTracNghiemEntity) {
        BaiTapTracNghiemResponse baiTapTracNghiemResponse = modelMapper.map(baiTapTracNghiemEntity, BaiTapTracNghiemResponse.class);
        return baiTapTracNghiemResponse;
    }
}
