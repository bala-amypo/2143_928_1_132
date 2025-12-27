package com.example.barter.service.impl;

import com.example.barter.model.SkillCategory;
import com.example.barter.repository.SkillCategoryRepository;
import com.example.barter.service.SkillCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillCategoryServiceImpl implements SkillCategoryService {

    private final SkillCategoryRepository repository;

    public SkillCategoryServiceImpl(SkillCategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public SkillCategory create(SkillCategory category) {
        return repository.save(category);
    }

    @Override
    public List<SkillCategory> getAll() {
        return repository.findAll();
    }
}
