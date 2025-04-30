package com.example.chatbotai_backend.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BaiTapTracNghiemDTO {
    private String id;
    private String deBai;
    private List<String> cacDapAn;
    private String dapAnDung;
    private Integer idCuocThi;
}
