package com.example.demo.Service;

import com.example.demo.Entity.SkillEntity;
import java.util.List;

public interface SkillService {
    SkillEntity createSkill(SkillEntity skill);
    SkillEntity updateSkill(Long id, SkillEntity skill);
    List<SkillEntity> getAllSkills();
}
