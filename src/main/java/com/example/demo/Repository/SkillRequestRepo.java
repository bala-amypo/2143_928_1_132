package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.SkillRequestEntity;
import java.util.List;

public interface SkillRequestRepo extends JpaRepository<SkillRequestEntity, Long> {
    List<SkillRequestEntity> findByUser_Id(Long userId);
}
