package com.example.chatbotai_backend.convert;

import com.example.chatbotai_backend.entity.SubmissionEntity;
import com.example.chatbotai_backend.model.dto.SubmissionDTO;
import com.example.chatbotai_backend.model.response.SubmissionResponse;
import com.example.chatbotai_backend.repository.BaiTapLapTrinhRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SubmissionConvert {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private BaiTapLapTrinhRepository baiTapLapTrinhRepository;

    public SubmissionEntity toSubmissionEntity(SubmissionDTO submissionDTO){
        SubmissionEntity submissionEntity = modelMapper.map(submissionDTO, SubmissionEntity.class);
        submissionEntity.setBaiTapLapTrinh(baiTapLapTrinhRepository.findById(submissionDTO.getBaiTapLapTrinhId()).get());
        return submissionEntity;
    }

    public SubmissionResponse toSubmissionResponse(SubmissionEntity submissionEntity){
        SubmissionResponse submissionResponse = modelMapper.map(submissionEntity, SubmissionResponse.class);
        submissionResponse.setBaiTapLapTrinhId(submissionEntity.getBaiTapLapTrinh().getId());
        return submissionResponse;
    }
}
