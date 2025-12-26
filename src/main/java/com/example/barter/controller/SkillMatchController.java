package com.example.barter.controller;

import com.example.barter.model.SkillMatch;
import com.example.barter.service.SkillMatchService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matches")
public class SkillMatchController {

    private final SkillMatchService service;

    public SkillMatchController(SkillMatchService service) {
        this.service = service;
    }

    @PostMapping
    public SkillMatch create(@RequestBody SkillMatch match) {
        return service.create(match);
    }
}
