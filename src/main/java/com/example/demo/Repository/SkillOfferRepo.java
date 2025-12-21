package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.SkillOfferEntity;
import java.util.List;

public interface SkillOfferRepo extends JpaRepository<SkillOfferEntity, Long> {
    List<SkillOfferEntity> findByUser_Id(Long userId);
}

