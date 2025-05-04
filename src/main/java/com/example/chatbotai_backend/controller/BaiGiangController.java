package com.example.chatbotai_backend.controller;

import com.example.chatbotai_backend.model.dto.BaiGiangDTO;
import com.example.chatbotai_backend.model.response.BaiGiangResponse;
import com.example.chatbotai_backend.service.BaiGiangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class BaiGiangController {
    @Autowired
    private BaiGiangService baiGiangService;
    @PostMapping("add/bai-giang")
    public ResponseEntity<?> addBaiGiang(@RequestBody BaiGiangDTO baiGiangDTO){
        try{
            baiGiangService.addBaiGiang(baiGiangDTO);
            return ResponseEntity.ok().body("Them bai giang thanh cong");
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @PutMapping("update/bai-giang")
    public ResponseEntity<?> updateBaiGiang(@RequestBody BaiGiangDTO baiGiangDTO){
        try{
            baiGiangService.updateBaiGiang(baiGiangDTO);
            return ResponseEntity.ok().body("Cap nhat bai giang thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @DeleteMapping("delete/bai-giang")
    public ResponseEntity<?> deleteBaiGiang(@RequestBody List<String> ids){
        try{
            baiGiangService.deleteBaiGiang(ids);
            return ResponseEntity.ok().body("Xoa bai giang thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @GetMapping("get/bai-giang/by/mon-hoc-{id}")
    public ResponseEntity<?> getBaiGiangByMonHoc(@PathVariable("id") Integer id){
        try{
            List<BaiGiangResponse> result = baiGiangService.getBaiGiangByMonHoc(id);
            return ResponseEntity.ok().body(result);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @GetMapping("search/bai-giang-{id}")
    public ResponseEntity<?> searchBaiGiang(@PathVariable String id){
        try{
            BaiGiangResponse baiGiangResponse = baiGiangService.searchBaiGiangById(id);
            return ResponseEntity.ok().body(baiGiangResponse);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
