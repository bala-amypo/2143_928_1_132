package com.example.barter.controller;

import com.example.barter.model.SkillOffer;
import com.example.barter.service.SkillOfferService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offers")
public class SkillOfferController {

    private final SkillOfferService service;

    public SkillOfferController(SkillOfferService service) {
        this.service = service;
    }

    @PostMapping
    public SkillOffer create(@RequestBody SkillOffer offer) {
        return service.create(offer);
    }

    @GetMapping
    public List<SkillOffer> getActive() {
        return service.getActiveOffers();
    }
}
