package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.MatchRecordEntity;
import java.util.List;

public interface MatchRecordRepo extends JpaRepository<MatchRecordEntity, Long> {
    List<MatchRecordEntity> findByUserA_IdOrUserB_Id(Long a, Long b);
}
