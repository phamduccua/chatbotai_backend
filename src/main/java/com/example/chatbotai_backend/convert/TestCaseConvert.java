package com.example.chatbotai_backend.convert;

import com.example.chatbotai_backend.entity.TestCaseEntity;
import com.example.chatbotai_backend.model.dto.TestCaseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestCaseConvert {
    @Autowired
    private ModelMapper modelMapper;

    public TestCaseEntity toTestCaseEntity(TestCaseDTO dto) {
        TestCaseEntity testCaseEntity = modelMapper.map(dto, TestCaseEntity.class);
        return testCaseEntity;
    }
}
