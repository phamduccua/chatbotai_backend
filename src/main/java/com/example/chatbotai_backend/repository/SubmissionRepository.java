package com.example.chatbotai_backend.repository;

import com.example.chatbotai_backend.entity.SubmissionEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional
public interface SubmissionRepository  extends JpaRepository<SubmissionEntity, Integer> {
    Optional<SubmissionEntity> findById(Integer id);
}
