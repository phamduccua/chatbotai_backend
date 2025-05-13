package com.example.chatbotai_backend.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaiTapLapTrinhDTO {
    private Integer id;
    @NotBlank(message = "Ma bai tap khong duoc de trong")
    private String ma;
    @NotBlank(message = "Ten bai tap khong duoc de trong")
    private String ten;
    private String deBai;
    private String yeuCauDauVao;
    private String yeuCauDauRa;
    private String gioiHanDauVao;
    private Integer gioiHanBoNho;
    private Double gioiHanThoiGian;
    @NotNull(message = "Do kho khong dươc de trong")
    private Integer level;
    @NotNull(message = "Id cuoc thi khong duoc trong")
    private Integer idBaiThucHanh;
}
