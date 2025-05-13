package com.example.chatbotai_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="baithuchanh")
public class BaiThucHanhEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;

    @Column(name="Ten")
    private String ten;

    @Column(name="ChiTiet")
    private String chiTiet;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Id_MonHoc")
    private MonHocEntity monHoc;

    @OneToMany(mappedBy = "baiThucHanhEntity", orphanRemoval = true)
    private List<BaiTapLapTrinhEntity> baiTapLapTrinh = new ArrayList<>();
}
