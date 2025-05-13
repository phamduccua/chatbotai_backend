package com.example.chatbotai_backend.model.response;

import com.example.chatbotai_backend.entity.TestCaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BaiTapLapTrinhResponse {
    private Integer id;
    private String ma;
    private String ten;
    private String deBai;
    private String yeuCauDauVao;
    private String yeuCauDauRa;
    private String gioiHanDauVao;
    private Integer gioiHanBoNho;
    private Double gioiHanThoiGian;
    private List<TestCaseEntity> testCases;
    private Integer level;
    private Integer idBaiThucHanh;
}
