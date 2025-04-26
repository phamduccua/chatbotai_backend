package com.example.chatbotai_backend.controller;


import com.example.chatbotai_backend.model.dto.MonHocDTO;
import com.example.chatbotai_backend.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class MonHocController {
    @Autowired
    private MonHocService monHocService;
    @PostMapping("add/mon-hoc")
    public ResponseEntity<?> addMonHoc(@RequestBody MonHocDTO monHocDTO) {
        try{
            monHocService.addMonHoc(monHocDTO);
            return ResponseEntity.ok().body("Thêm môn học thành công");
        }catch(Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
