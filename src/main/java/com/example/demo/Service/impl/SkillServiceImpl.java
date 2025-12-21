package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.Service.SkillService;
import com.example.demo.Repository.SkillRepo;
import com.example.demo.Entity.SkillEntity;
import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    private final SkillRepo repo;

    public SkillServiceImpl(SkillRepo repo) {
        this.repo = repo;
    }

    public SkillEntity createSkill(SkillEntity skill) {
        return repo.save(skill);
    }

    public SkillEntity updateSkill(Long id, SkillEntity skill) {
        SkillEntity s = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Skill not found"));
        s.setName(skill.getName());
        s.setCategory(skill.getCategory());
        s.setDescription(skill.getDescription());
        return repo.save(s);
    }

    public List<SkillEntity> getAllSkills() {
        return repo.findAll();
    }
}
