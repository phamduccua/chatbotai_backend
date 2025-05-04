package com.example.chatbotai_backend.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BaiGiangDTO {
    private String id;
    private String ten;
    private String chiTiet;
    private List<String> viDu;
    private Integer idMonHoc;
}
