package com.example.barter.service.impl;

import com.example.barter.model.SkillMatch;
import com.example.barter.repository.SkillMatchRepository;
import com.example.barter.service.SkillMatchService;
import org.springframework.stereotype.Service;

@Service
public class SkillMatchServiceImpl implements SkillMatchService {

    private final SkillMatchRepository repository;

    public SkillMatchServiceImpl(SkillMatchRepository repository) {
        this.repository = repository;
    }

    @Override
    public SkillMatch create(SkillMatch match) {
        return repository.save(match);
    }
}
