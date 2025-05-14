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
    @Column(name="id")
    private Integer id;

    @Column(name="malophoc")
    private String maLopHoc;

    @Column(name="tenlophoc")
    private String tenLopHoc;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_monhoc")
    private MonHocEntity monHoc;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_giangvien")
    private UserEntity giangVien;
}
