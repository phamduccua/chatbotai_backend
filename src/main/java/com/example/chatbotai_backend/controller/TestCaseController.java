package com.example.chatbotai_backend.controller;

import com.example.chatbotai_backend.model.dto.TestCaseDTO;
import com.example.chatbotai_backend.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestCaseController {
    @Autowired
    private TestCaseService testCaseService;
    @PostMapping("add/test-case")
    public ResponseEntity<?> addTestCase(@RequestBody TestCaseDTO testCaseDTO) {
        try{
            testCaseService.addTestCase(testCaseDTO);
            return ResponseEntity.ok().body("Thêm thành công");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
