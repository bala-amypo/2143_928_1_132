package com.example.demo.Service;

import com.example.demo.Entity.SkillOfferEntity;
import java.util.List;

public interface SkillOfferService {
    SkillOfferEntity createOffer(SkillOfferEntity offer);
    SkillOfferEntity getOfferById(Long id);
    List<SkillOfferEntity> getOffersByUser(Long userId);
}
