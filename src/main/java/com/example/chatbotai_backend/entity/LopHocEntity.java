package com.example.chatbotai_backend.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="lophoc")
public class LopHocEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer id;

    @Column(name="MaLopHoc")
    private String maLopHoc;

    @Column(name="TenLopHoc")
    private String tenLopHoc;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Id_MonHoc")
    private MonHocEntity monHoc;

}
