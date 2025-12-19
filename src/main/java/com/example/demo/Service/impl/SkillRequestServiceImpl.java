package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.Service.SkillRequestService;
import com.example.demo.Repository.SkillRequestRepo;
import com.example.demo.Entity.SkillRequestEntity;
import java.util.List;

@Service
public class SkillRequestServiceImpl implements SkillRequestService {

    private final SkillRequestRepo repo;

    public SkillRequestServiceImpl(SkillRequestRepo repo) {
        this.repo = repo;
    }

    public SkillRequestEntity createRequest(SkillRequestEntity request) {
        return repo.save(request);
    }

    public SkillRequestEntity getRequestById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Skill not found"));
    }

    public List<SkillRequestEntity> getRequestsByUser(Long userId) {
        return repo.findByUser_Id(userId);
    }
}
