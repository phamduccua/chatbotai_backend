package com.example.chatbotai_backend.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="submissionbaitaplaptrinh")
public class SubmissionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer id;

    @Column(name="MaCode")
    private String maCode;

    @Column(name="TrangThai")
    private String trangThai;

    @Column(name="ChiTietLoiBienDich")
    private String chiTietLoiBienDich;

    @Column(name="ThoiGianNopBai")
    private LocalDateTime thoiGianNopBai;

    @Column(name="ThoiGianChay")
    private Double thoiGianChay;

    @Column(name="BoNhoSuDung")
    private Integer bonhoSuDung;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Id_BaiTapLapTrinh")
    private BaiTapLapTrinhEntity baiTapLapTrinh;
}
