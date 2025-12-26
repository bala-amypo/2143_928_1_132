package com.example.barter.service;

import com.example.barter.model.SkillRequest;
import java.util.List;

public interface SkillRequestService {

    SkillRequest create(SkillRequest request);

    List<SkillRequest> getActiveRequests();
}
