package com.example.chatbotai_backend.entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "BaiGiang")
public class BaiGiangEntity {
    @Id
    private String id;
    private String ten;
    private String chiTiet;
    private List<String> viDu;
    private Integer idMonHoc;
}
