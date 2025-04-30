package com.example.chatbotai_backend.repository;

import com.example.chatbotai_backend.entity.BaiTapTracNghiemEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface BaiTapTracNghiemRepository extends MongoRepository<BaiTapTracNghiemEntity, String> {
    void deleteByIdIn(List<String> ids);
}
