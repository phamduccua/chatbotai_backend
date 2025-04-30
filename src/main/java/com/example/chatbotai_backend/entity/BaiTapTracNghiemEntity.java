package com.example.chatbotai_backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection  = "BaiTapTracNghiem")
public class BaiTapTracNghiemEntity {
    @Id
    private String id;

    private String deBai;
    private List<String> cacDapAn;
    private String dapAnDung;
    private Integer idCuocThi;
}
