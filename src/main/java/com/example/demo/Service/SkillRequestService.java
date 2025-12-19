package com.example.demo.Service;

import com.example.demo.Entity.SkillRequestEntity;
import java.util.List;

public interface SkillRequestService {
    SkillRequestEntity createRequest(SkillRequestEntity request);
    SkillRequestEntity getRequestById(Long id);
    List<SkillRequestEntity> getRequestsByUser(Long userId);
}
