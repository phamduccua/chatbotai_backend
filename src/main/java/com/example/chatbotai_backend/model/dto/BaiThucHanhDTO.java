package com.example.chatbotai_backend.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaiThucHanhDTO {
    private Integer id;
    @NotBlank(message = "Ten cuoc thi khong duoc trong")
    private String ten;
    @NotBlank(message = "Khong duoc de trong phan chi tiet cuoc thi")
    private String chiTiet;
    @NotNull(message = "Khong duoc de trong mon id mon hoc")
    private Integer idMonHoc;
}
