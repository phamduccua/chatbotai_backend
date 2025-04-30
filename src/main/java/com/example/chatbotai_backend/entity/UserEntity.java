package com.example.chatbotai_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name="Username")
    private String username;

    @Column(name="Fullname")
    private String fullname;

    @Column(name="Email")
    private String email;

    @Column(name="Password")
    private String password;

    @Column(name="Address")
    private String address;

    @Column(name="Role")
    private String role;

    @Column(name="Status")
    private Integer status;

    @OneToMany(mappedBy = "giangVien", orphanRemoval = true)
    private List<LopHocEntity> lopHocEntites = new ArrayList<LopHocEntity>();
}
