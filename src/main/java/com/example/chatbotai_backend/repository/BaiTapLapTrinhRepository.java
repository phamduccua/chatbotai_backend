package com.example.chatbotai_backend.repository;

import com.example.chatbotai_backend.entity.BaiTapLapTrinhEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface BaiTapLapTrinhRepository extends JpaRepository<BaiTapLapTrinhEntity, Integer> {
    void deleteByIdIn(List<Integer> ids);
}
