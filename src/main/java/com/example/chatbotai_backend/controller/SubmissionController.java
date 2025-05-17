package com.example.chatbotai_backend.controller;


import com.example.chatbotai_backend.model.dto.SubmissionDTO;
import com.example.chatbotai_backend.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class SubmissionController {
    @Autowired
    private SubmissionService submissionService;

    @PostMapping("add/submission")
    public ResponseEntity<?> addSubmission(@RequestBody SubmissionDTO submissionDTO){
        try{
            submissionService.addSubmission(submissionDTO);
            return ResponseEntity.ok().body("Them submission thanh cong");
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
