package com.example.chatbotai_backend.repository;

import com.example.chatbotai_backend.entity.TestCaseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestCaseRepository extends MongoRepository<TestCaseEntity, String> {
    List<TestCaseEntity> findByIdBaiTapLapTrinhAndExample(Integer idBaiTapLapTrinh, Boolean example);
}
