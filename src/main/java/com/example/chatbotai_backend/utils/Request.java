package com.example.chatbotai_backend.utils;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
public class Request {
    private String url = "https://my-flask-api-repo-40994065734.asia-southeast1.run.app/api/chat";
    public String PostRequest(String messesge){
        RestTemplate restTemplate = new RestTemplate();
        Map<String,String> requestBody = new HashMap<>();
        requestBody.put("query",messesge);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, String>> requestEntity = new HttpEntity<>(requestBody, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(url, requestEntity, String.class);
        return response.getBody();
    }
}
