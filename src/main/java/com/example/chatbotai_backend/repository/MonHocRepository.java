package com.example.chatbotai_backend.repository;


import com.example.chatbotai_backend.entity.MonHocEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonHocRepository extends JpaRepository<MonHocEntity, Integer> {
}
