package com.example.chatbotai_backend.controller;

import com.example.chatbotai_backend.model.dto.CuocThiDTO;
import com.example.chatbotai_backend.service.CuocThiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CuocThiController {
    @Autowired
    private CuocThiService cuocThiService;
    @PostMapping("add/cuoc-thi")
    public ResponseEntity<?> addCuocThi(@RequestBody CuocThiDTO cuocThiDTO) {
        try{
            cuocThiService.addCuocThi(cuocThiDTO);
            return ResponseEntity.ok().body("Them cuoc thi thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @PutMapping("update/cuoc-thi")
    public ResponseEntity<?> updateCuocThi(@RequestBody CuocThiDTO cuocThiDTO) {
        try{
            cuocThiService.updateCuocThi(cuocThiDTO);
            return ResponseEntity.ok().body("Sua cuoc thi thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @DeleteMapping("delete/cuoc-thi")
    public ResponseEntity<?> deleteCuocThi(@RequestBody List<Integer> ids) {
        try{
            cuocThiService.deleteCuocThi(ids);
            return ResponseEntity.ok().body("Xoa cuoc thi thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
