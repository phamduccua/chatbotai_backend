package com.example.chatbotai_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="submissionbaitaplaptrinh")
public class SubmissionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="macode")
    private String maCode;

    @Column(name="trangthai")
    private String trangThai;

    @Column(name="chitietloibiendich")
    private String chiTietLoiBienDich;

    @Column(name="thoigiannopbai")
    private LocalDateTime thoiGianNopBai;

    @Column(name="thoigianchay")
    private Double thoiGianChay;

    @Column(name="bonhosudung")
    private Integer bonhoSuDung;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_baitaplaptrinh")
    private BaiTapLapTrinhEntity baiTapLapTrinh;
}
