package com.example.chatbotai_backend.controller;

import com.example.chatbotai_backend.model.dto.LopHocDTO;
import com.example.chatbotai_backend.service.LopHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class LopHocController {
    @Autowired
    private LopHocService lopHocService;
    @PostMapping("add/lop-hoc")
    public ResponseEntity<?> addLopHoc(@RequestBody LopHocDTO lophocDTO) {
        try{
            lopHocService.addLopHoc(lophocDTO);
            return ResponseEntity.ok().body("Them lop hoc thanh cong");
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @PutMapping("update/lop-hoc")
    public ResponseEntity<?> updateLopHoc(@RequestBody LopHocDTO lophocDTO) {
        try{
            lopHocService.updateLopHoc(lophocDTO);
            return ResponseEntity.ok().body("Sua lop hoc thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @DeleteMapping("detele/lop-hoc")
    public ResponseEntity<?> deleteLopHoc(@RequestBody List<Integer> ids) {
        try{
            lopHocService.deleteLopHoc(ids);
            return ResponseEntity.ok().body("Xoa lop hoc thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
