package com.example.chatbotai_backend.controller;


import com.example.chatbotai_backend.model.dto.AbstractDTO;
import com.example.chatbotai_backend.model.dto.BaiTapLapTrinhDTO;
import com.example.chatbotai_backend.model.response.BaiTapLapTrinhResponse;
import com.example.chatbotai_backend.model.response.CodeAndNameAndLevelBaiLapTrinh;
import com.example.chatbotai_backend.service.BaiTapLapTrinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class BaiTapLapTrinhController {
    @Autowired
    private BaiTapLapTrinhService baiTapLapTrinhService;
    @PostMapping("/add/bai-tap-lap-trinh")
    public ResponseEntity<?> addBaiTapLapTrinh(@RequestBody BaiTapLapTrinhDTO baiTapLapTrinhDTO) {
        try{
            baiTapLapTrinhService.addBaiTapLapTrinh(baiTapLapTrinhDTO);
            return ResponseEntity.ok().body("Them bai tap thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("update/bai-tap-lap-trinh")
    public ResponseEntity<?> updateBaiTapLapTrinh(@RequestBody BaiTapLapTrinhDTO baiTapLapTrinhDTO) {
        try{
            baiTapLapTrinhService.updateBaiTapLapTrinh(baiTapLapTrinhDTO);
            return ResponseEntity.ok().body("Sua bai tap thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @DeleteMapping("detete/bai-tap-lap-trinh")
    public ResponseEntity<?> deteteBaiTapLapTrinh(@RequestBody List<Integer> ids) {
        try{
            baiTapLapTrinhService.deleteBaiTapLapTrinh(ids);
            return ResponseEntity.ok().body("Xoa bai tap thanh cong");
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("get/bai-tap-lap-trinh")
    public ResponseEntity<?> get(){
        try{
            AbstractDTO abstractDTO = baiTapLapTrinhService.find();
            return ResponseEntity.ok().body(abstractDTO);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("get/bai-lap-trinh/by/bai-thuc-hanh-{id}")
    public ResponseEntity<?> getBaiTapLapTrinh(@PathVariable Integer id) {
        try{
            List<CodeAndNameAndLevelBaiLapTrinh> result = baiTapLapTrinhService.findByIdBaiThucHanh(id);
            return ResponseEntity.ok().body(result);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @GetMapping("get/bai-tap-lap-trinh-{ma}")
    public ResponseEntity<?> getBaiTapLapTrinhByMa(@PathVariable String ma) {
        try{
            BaiTapLapTrinhResponse result = baiTapLapTrinhService.findByMa(ma);
            return ResponseEntity.ok().body(result);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
