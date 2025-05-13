package com.example.chatbotai_backend.service.impl;

import com.example.chatbotai_backend.convert.TestCaseConvert;
import com.example.chatbotai_backend.model.dto.TestCaseDTO;
import com.example.chatbotai_backend.repository.TestCaseRepository;
import com.example.chatbotai_backend.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestCaseServiceImpl implements TestCaseService {
    @Autowired
    private TestCaseRepository testCaseRepository;
    @Autowired
    private TestCaseConvert testCaseConvert;
    @Override
    public void addTestCase(TestCaseDTO testCaseDTO) {
        testCaseRepository.save(testCaseConvert.toTestCaseEntity(testCaseDTO));
    }
}
