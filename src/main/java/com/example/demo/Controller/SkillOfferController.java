package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.Service.SkillOfferService;
import com.example.demo.Entity.SkillOfferEntity;
import java.util.List;

@RestController
@RequestMapping("/api/skill-offers")
public class SkillOfferController {

    private final SkillOfferService service;

    public SkillOfferController(SkillOfferService service) {
        this.service = service;
    }

    @PostMapping
    public SkillOfferEntity create(@RequestBody SkillOfferEntity offer) {
        return service.createOffer(offer);
    }

    @GetMapping("/{id}")
    public SkillOfferEntity getById(@PathVariable Long id) {
        return service.getOfferById(id);
    }

    @GetMapping("/user/{userId}")
    public List<SkillOfferEntity> getByUser(@PathVariable Long userId) {
        return service.getOffersByUser(userId);
    }
}
