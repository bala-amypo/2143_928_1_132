package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.SkillEntity;

public interface SkillRepo extends JpaRepository<SkillEntity, Long> {
}
