package com.example.demo.Service;

import com.example.demo.Entity.MatchRecordEntity;
import java.util.List;

public interface MatchRecordService {
    MatchRecordEntity generateMatch(Long userId);
    MatchRecordEntity getMatchById(Long id);
    List<MatchRecordEntity> getMatchesForUser(Long userId);
}
