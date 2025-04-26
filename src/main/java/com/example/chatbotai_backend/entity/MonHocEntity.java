package com.example.chatbotai_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="monhoc")
public class MonHocEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer id;

    @Column(name="Ten")
    private String ten;

    @Column(name="ChiTiet")
    private String chiTiet;

    @OneToMany(mappedBy = "monHoc", orphanRemoval = true)
    private List<CuocThiEntity> cuocThiEntities = new ArrayList<>();

    @OneToMany(mappedBy = "monHoc", orphanRemoval = true)
    private List<LopHocEntity> lopHocEntities = new ArrayList<>();
}
