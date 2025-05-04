package com.example.chatbotai_backend.controller;
import com.example.chatbotai_backend.model.dto.MonHocDTO;
import com.example.chatbotai_backend.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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
    @PutMapping("update/mon-hoc")
    public ResponseEntity<?> updateMonHoc(@RequestBody MonHocDTO monHocDTO) {
        try{
            monHocService.updateMonHoc(monHocDTO);
            return ResponseEntity.ok().body("Sua mon hoc thanh cong");
        }catch(Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @DeleteMapping("delete/mon-hoc")
    public ResponseEntity<?> deleteMonHoc(@RequestBody List<Integer> ids) {
        try{
            monHocService.deleteMonHoc(ids);
            return ResponseEntity.ok().body("Xoa mon hoc thanh cong");
        }catch(Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
