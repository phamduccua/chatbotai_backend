package com.example.chatbotai_backend.repository;

import com.example.chatbotai_backend.entity.BaiGiangEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface BaiGiangRepository extends MongoRepository<BaiGiangEntity, String> {
    void deleteByIdIn(List<String> ids);
    List<BaiGiangEntity> findByIdMonHoc(Integer idMonHoc);
}
