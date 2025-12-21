package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.Service.MatchRecordService;
import com.example.demo.Repository.MatchRecordRepo;
import com.example.demo.Entity.MatchRecordEntity;
import java.util.List;

@Service
public class MatchRecordServiceImpl implements MatchRecordService {

    private final MatchRecordRepo repo;

    public MatchRecordServiceImpl(MatchRecordRepo repo) {
        this.repo = repo;
    }

    public MatchRecordEntity generateMatch(Long userId) {
        throw new RuntimeException("No match found");
    }

    public MatchRecordEntity getMatchById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("No match found"));
    }

    public List<MatchRecordEntity> getMatchesForUser(Long userId) {
        return repo.findByUserA_IdOrUserB_Id(userId, userId);
    }
}
