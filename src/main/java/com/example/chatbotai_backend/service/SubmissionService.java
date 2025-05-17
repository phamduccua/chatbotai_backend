package com.example.chatbotai_backend.service;

import com.example.chatbotai_backend.entity.SubmissionEntity;
import com.example.chatbotai_backend.model.dto.SubmissionDTO;
import com.example.chatbotai_backend.model.response.SubmissionResponse;

import java.util.Optional;

public interface SubmissionService {
    void addSubmission(SubmissionDTO submissionDTO);
}
