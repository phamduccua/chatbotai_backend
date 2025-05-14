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
    @Column(name="id")
    private Integer id;

    @Column(name="ma")
    private String ma;

    @Column(name="ten")
    private String ten;

    @Column(name="debai")
    private String deBai;

    @Column(name="yeucaudauvao")
    private String yeuCauDauVao;

    @Column(name="yeucaudaura")
    private String yeuCauDauRa;

    @Column(name="gioihandauvao")
    private String gioiHanDauVao;

    @Column(name="gioihanbonho")
    private Integer gioiHanBoNho;

    @Column(name="gioihanthoigian")
    private Double gioiHanThoiGian;

    @Column(name="level")
    private Integer level;

    @OneToMany(mappedBy = "baiTapLapTrinh", orphanRemoval = true)
    private List<SubmissionEntity> submissionEntityList = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_baithuchanh")
    private BaiThucHanhEntity baiThucHanhEntity;

}
