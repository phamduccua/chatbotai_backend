package com.example.chatbotai_backend.service.impl;


import com.example.chatbotai_backend.controller.BaiTapLapTrinhController;
import com.example.chatbotai_backend.convert.BaiTapLapTrinhConvert;
import com.example.chatbotai_backend.entity.BaiTapLapTrinhEntity;
import com.example.chatbotai_backend.model.dto.AbstractDTO;
import com.example.chatbotai_backend.model.dto.BaiTapLapTrinhDTO;
import com.example.chatbotai_backend.model.response.BaiTapLapTrinhResponse;
import com.example.chatbotai_backend.model.response.CodeAndNameAndLevelBaiLapTrinh;
import com.example.chatbotai_backend.repository.BaiTapLapTrinhRepository;
import com.example.chatbotai_backend.service.BaiTapLapTrinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BaiTapLapTrinhServiceImpl implements BaiTapLapTrinhService {
    @Autowired
    private BaiTapLapTrinhRepository baiTapLapTrinhRepository;
    @Autowired
    private BaiTapLapTrinhConvert baiTapLapTrinhConvert;
    @Override
    public void addBaiTapLapTrinh(BaiTapLapTrinhDTO baiTapLapTrinhDTO) {
        baiTapLapTrinhRepository.save(baiTapLapTrinhConvert.toBaiTapLapTrinhEntity(baiTapLapTrinhDTO));
    }

    @Override
    public void updateBaiTapLapTrinh(BaiTapLapTrinhDTO baiTapLapTrinhDTO) {
        if(baiTapLapTrinhDTO.getId() == null){
            throw new IllegalArgumentException("ID của bài tập không được để trống");
        }
        baiTapLapTrinhRepository.save(baiTapLapTrinhConvert.toBaiTapLapTrinhEntity(baiTapLapTrinhDTO));
    }

    @Override
    public void deleteBaiTapLapTrinh(List<Integer> ids) {
        baiTapLapTrinhRepository.deleteByIdIn(ids);
    }

    @Override
    public List<CodeAndNameAndLevelBaiLapTrinh> findByIdBaiThucHanh(Integer idBaiThucHanh) {
        List<CodeAndNameAndLevelBaiLapTrinh> result = baiTapLapTrinhRepository.findByIdBaiThucHanh(idBaiThucHanh);
        return result;
    }

    @Override
    public BaiTapLapTrinhResponse findByMa(String ma) {
        BaiTapLapTrinhEntity baiTapLapTrinhEntity = baiTapLapTrinhRepository.findByMa(ma);
        BaiTapLapTrinhResponse baiTapLapTrinhResponse = baiTapLapTrinhConvert.toBaiTapLapTrinhResponse(baiTapLapTrinhEntity);
        return baiTapLapTrinhResponse;
    }

    @Override
    public AbstractDTO find() {
        List<CodeAndNameAndLevelBaiLapTrinh> list = baiTapLapTrinhRepository.find();
        AbstractDTO abstractDTO = new AbstractDTO();
        abstractDTO.setListResult(list);
        return abstractDTO;
    }
}
