package com.example.chatbotai_backend.model.response;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class SubmissionResponse {
    private Integer id;
    private String maCode;
    private String trangThai;
    private String chiTietLoiBienDich;
    private LocalDateTime thoiGianNopBai;
    private Double thoiGianChay;
    private Integer bonhoSuDung;
    private Integer baiTapLapTrinhId;
}
