package com.example.chatbotai_backend.controller;

import com.example.chatbotai_backend.model.dto.AbstractDTO;
import com.example.chatbotai_backend.model.dto.BaiThucHanhDTO;
import com.example.chatbotai_backend.service.BaiThucHanhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class BaiThucHanhController {
    @Autowired
    private BaiThucHanhService baiThucHanhService;
    @PostMapping("add/bai-thuc-hanh")
    public ResponseEntity<?> addBaiThucHanh(@RequestBody BaiThucHanhDTO baiThucHanhDTO) {
        try{
            baiThucHanhService.addBaiThucHanh(baiThucHanhDTO);
            return ResponseEntity.ok().body("Them bai thuc hanh thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @PutMapping("update/bai-thuc-hanh")
    public ResponseEntity<?> updateBaiThucHanh(@RequestBody BaiThucHanhDTO baiThucHanhDTO) {
        try{
            baiThucHanhService.updateBaiThucHanh(baiThucHanhDTO);
            return ResponseEntity.ok().body("Sua bai thuc hanh thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @DeleteMapping("delete/bai-thuc-hanh")
    public ResponseEntity<?> deleteBaiThucHanh(@RequestBody List<Integer> ids) {
        try{
            baiThucHanhService.deleteBaiThucHanh(ids);
            return ResponseEntity.ok().body("Xoa bai thuc hanh thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @GetMapping("get/bai-thuc-hanh")
    public ResponseEntity<?> getBaiThucHanh() {
        try{
            AbstractDTO result = baiThucHanhService.getBaiThucHanh();
            return ResponseEntity.ok().body(result);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
