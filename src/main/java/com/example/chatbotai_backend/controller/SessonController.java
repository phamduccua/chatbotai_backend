package com.example.chatbotai_backend.controller;
import com.example.chatbotai_backend.service.SessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class SessonController {
    @Autowired
    private SessonService sessonService;
    @PostMapping("sesson")
    public ResponseEntity<?> sesson(@RequestBody String messege) {
        try{
            String result = sessonService.sendMessage(messege);
            return ResponseEntity.ok().body(result);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
