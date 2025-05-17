package com.example.chatbotai_backend.service.impl;

import com.example.chatbotai_backend.convert.SubmissionConvert;
import com.example.chatbotai_backend.entity.SubmissionEntity;
import com.example.chatbotai_backend.model.dto.SubmissionDTO;
import com.example.chatbotai_backend.model.response.SubmissionResponse;
import com.example.chatbotai_backend.repository.SubmissionRepository;
import com.example.chatbotai_backend.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubmissionServiceImpl implements SubmissionService {
    @Autowired
    private SubmissionRepository submissionRepository;
    @Autowired
    private SubmissionConvert submissionConvert;


    @Override
    public void addSubmission(SubmissionDTO submissionDTO){
        submissionRepository.save(submissionConvert.toSubmissionEntity(submissionDTO));
    }

}
