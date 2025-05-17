package com.example.chatbotai_backend.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class SubmissionDTO {
    private Integer id;
    @NotNull(message = "Khong duoc de trong ma code")
    private String maCode;
    private String trangThai;
    private String chiTietLoiBienDich;
    private LocalDateTime thoiGianNopBai;
    private Double thoiGianChay;
    private Integer bonhoSuDung;
    @NotBlank(message = "Khong duoc de trong id bai tap lap trinh")
    private Integer baiTapLapTrinhId;

}
