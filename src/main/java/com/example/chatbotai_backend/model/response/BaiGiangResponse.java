package com.example.chatbotai_backend.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BaiGiangResponse {
    private String id;
    private String ten;
    private String chiTiet;
    private List<String> viDu;
    private String tenMonHoc;
}
