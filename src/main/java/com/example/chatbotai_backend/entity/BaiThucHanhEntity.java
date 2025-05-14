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
    @Column(name="id")
    private int id;

    @Column(name="ten")
    private String ten;

    @Column(name="chitiet")
    private String chiTiet;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_monhoc")
    private MonHocEntity monHoc;

    @OneToMany(mappedBy = "baiThucHanhEntity", orphanRemoval = true)
    private List<BaiTapLapTrinhEntity> baiTapLapTrinh = new ArrayList<>();
}
