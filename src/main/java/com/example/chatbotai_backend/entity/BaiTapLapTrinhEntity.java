package com.example.chatbotai_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name="baitaplaptrinh")
public class BaiTapLapTrinhEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer id;

    @Column(name="Ma")
    private String ma;

    @Column(name="Ten")
    private String ten;

    @Column(name="YeuCauDauVao")
    private String yeuCauDauVao;

    @Column(name="YeuCauDauRa")
    private String yeuCauDauRa;

    @Column(name="GioiHanDauVao")
    private String gioiHanDauVao;

    @Column(name="GioiHanBoNho")
    private String gioiHanBoNho;

    @Column(name="GioiHanThoiGian")
    private String gioiHanThoiGian;

    @OneToMany(mappedBy = "baiTapLapTrinh", orphanRemoval = true)
    private List<SubmissionEntity> submissionEntityList = new ArrayList<>();
}
