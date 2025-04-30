package com.example.chatbotai_backend.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LopHocDTO {
    private Integer id;
    @NotBlank(message = "Ma lop hoc khong duoc de trong")
    private String maLopHoc;
    @NotBlank(message = "Ten lop hoc khong duoc de trong")
    private String tenLopHoc;
    @NotNull(message = "Khong duoc de trong ma mon hoc")
    private Integer idMonHoc;
    @NotNull(message = "Khong duoc bo trong ma giang vien")
    private Integer idGiangVien;
}
