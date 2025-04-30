package com.example.chatbotai_backend.controller;

import com.example.chatbotai_backend.model.dto.BaiTapTracNghiemDTO;
import com.example.chatbotai_backend.service.BaiTapTracNghiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class BaiTapTracNghiemController {
    @Autowired
    private BaiTapTracNghiemService baiTapTracNghiemService;
    @PostMapping("add/bai-tap-trac-nghiem")
    public ResponseEntity<?> addBaiTapTracNghiem(@RequestBody BaiTapTracNghiemDTO baiTapTracNghiemDTO) {
        try{
            baiTapTracNghiemService.addBaiTapTracNghiem(baiTapTracNghiemDTO);
            return ResponseEntity.ok().body("Them bai tap thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @PutMapping("update/bai-tap-trac-nghiem")
    public ResponseEntity<?> updateBaiTapTracNghiem(@RequestBody BaiTapTracNghiemDTO baiTapTracNghiemDTO) {
        try{
            baiTapTracNghiemService.updateBaiTapTracNghiem(baiTapTracNghiemDTO);
            return ResponseEntity.ok().body("Sua bai tap thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @DeleteMapping("delete/bai-tap-trac-nghiem")
    public ResponseEntity<?> deleteBaiTapTracNghiem(@RequestBody List<String> ids) {
        try{
            baiTapTracNghiemService.deleteBaiTapTracNghiem(ids);
            return ResponseEntity.ok().body("Xoa bai tap thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
