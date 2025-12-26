package com.example.barter.service.impl;

import com.example.barter.model.SkillOffer;
import com.example.barter.repository.SkillOfferRepository;
import com.example.barter.service.SkillOfferService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillOfferServiceImpl implements SkillOfferService {

    private final SkillOfferRepository repository;

    public SkillOfferServiceImpl(SkillOfferRepository repository) {
        this.repository = repository;
    }

    @Override
    public SkillOffer create(SkillOffer offer) {
        return repository.save(offer);
    }

    @Override
    public List<SkillOffer> getActiveOffers() {
        return repository.findByActiveTrue();
    }
}
