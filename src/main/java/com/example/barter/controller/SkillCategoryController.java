package com.example.barter.controller;

import com.example.barter.model.SkillCategory;
import com.example.barter.service.SkillCategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillCategoryController {

    private final SkillCategoryService service;

    public SkillCategoryController(SkillCategoryService service) {
        this.service = service;
    }

    @PostMapping
    public SkillCategory create(@RequestBody SkillCategory category) {
        return service.create(category);
    }

    @GetMapping
    public List<SkillCategory> getAll() {
        return service.getAll();
    }
}
