package com.example.chatbotai_backend.repository;

import com.example.chatbotai_backend.entity.BaiTapLapTrinhEntity;
import com.example.chatbotai_backend.model.response.CodeAndNameAndLevelBaiLapTrinh;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface BaiTapLapTrinhRepository extends JpaRepository<BaiTapLapTrinhEntity, Integer> {
    void deleteByIdIn(List<Integer> ids);
    @Query("SELECT new com.example.chatbotai_backend.model.response.CodeAndNameAndLevelBaiLapTrinh(b.id,b.ma, b.ten, b.level) FROM BaiTapLapTrinhEntity b WHERE b.baiThucHanhEntity.id = :idMonHoc")
    List<CodeAndNameAndLevelBaiLapTrinh> findByIdBaiThucHanh(Integer idMonHoc);
    BaiTapLapTrinhEntity findByMa(String ma);
    @Query("SELECT new com.example.chatbotai_backend.model.response.CodeAndNameAndLevelBaiLapTrinh(b.id,b.ma, b.ten, b.level) FROM BaiTapLapTrinhEntity b")
    List<CodeAndNameAndLevelBaiLapTrinh> find();
    Optional<BaiTapLapTrinhEntity> findById(Integer id);
}
