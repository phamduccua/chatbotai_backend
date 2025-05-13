package com.example.chatbotai_backend.convert;

import com.example.chatbotai_backend.entity.BaiTapLapTrinhEntity;
import com.example.chatbotai_backend.model.dto.BaiTapLapTrinhDTO;
import com.example.chatbotai_backend.model.response.BaiTapLapTrinhResponse;
import com.example.chatbotai_backend.repository.BaiThucHanhRepository;
import com.example.chatbotai_backend.repository.TestCaseRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaiTapLapTrinhConvert {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private BaiThucHanhRepository cuocThiRepository;
    @Autowired
    private TestCaseRepository testCaseRepository;

    public BaiTapLapTrinhEntity toBaiTapLapTrinhEntity(BaiTapLapTrinhDTO baiTapLapTrinhDTO) {
        BaiTapLapTrinhEntity baiTapLapTrinhEntity = modelMapper.map(baiTapLapTrinhDTO, BaiTapLapTrinhEntity.class);
        baiTapLapTrinhEntity.setBaiThucHanhEntity(cuocThiRepository.findById(baiTapLapTrinhDTO.getIdBaiThucHanh()).get());
        return baiTapLapTrinhEntity;
    }

    public BaiTapLapTrinhResponse toBaiTapLapTrinhResponse(BaiTapLapTrinhEntity baiTapLapTrinhEntity) {
        BaiTapLapTrinhResponse baiTapLapTrinhResponse = modelMapper.map(baiTapLapTrinhEntity, BaiTapLapTrinhResponse.class);
        baiTapLapTrinhResponse.setIdBaiThucHanh(baiTapLapTrinhEntity.getBaiThucHanhEntity().getId());
        baiTapLapTrinhResponse.setTestCases(testCaseRepository.findByIdBaiTapLapTrinhAndExample(baiTapLapTrinhEntity.getId(),true));
        return baiTapLapTrinhResponse;
    }
}
