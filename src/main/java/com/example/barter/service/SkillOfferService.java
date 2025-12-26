package com.example.barter.service;

import com.example.barter.model.SkillOffer;
import java.util.List;

public interface SkillOfferService {

    SkillOffer create(SkillOffer offer);

    List<SkillOffer> getActiveOffers();
}
