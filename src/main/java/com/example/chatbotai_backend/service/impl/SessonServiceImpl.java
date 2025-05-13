package com.example.chatbotai_backend.service.impl;

import com.example.chatbotai_backend.service.SessonService;
import com.example.chatbotai_backend.utils.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessonServiceImpl implements SessonService {
    @Autowired
    private Request request;
    @Override
    public String sendMessage(String message) {
        return request.PostRequest(message);
    }
}
