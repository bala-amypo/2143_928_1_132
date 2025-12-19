package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.Service.SkillOfferService;
import com.example.demo.Repository.SkillOfferRepo;
import com.example.demo.Entity.SkillOfferEntity;
import java.util.List;

@Service
public class SkillOfferServiceImpl implements SkillOfferService {

    private final SkillOfferRepo repo;

    public SkillOfferServiceImpl(SkillOfferRepo repo) {
        this.repo = repo;
    }

    public SkillOfferEntity createOffer(SkillOfferEntity offer) {
        return repo.save(offer);
    }

    public SkillOfferEntity getOfferById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Offer not found"));
    }

    public List<SkillOfferEntity> getOffersByUser(Long userId) {
        return repo.findByUser_Id(userId);
    }
}
