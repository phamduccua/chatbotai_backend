package com.example.chatbotai_backend.repository;

import com.example.chatbotai_backend.entity.BaiGiangEntity;
import com.example.chatbotai_backend.model.response.IdAndNameBaiGiang;
import jakarta.transaction.Transactional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface BaiGiangRepository extends MongoRepository<BaiGiangEntity, String> {
    void deleteByIdIn(List<String> ids);
    @Query(value = "{'idMonHoc' : ?0}", fields = "{'ten' : 1, '_id' :  1}")
    List<IdAndNameBaiGiang> findByIdMonHoc(Integer idMonHoc);
}
