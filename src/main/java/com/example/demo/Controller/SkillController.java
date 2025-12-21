package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.Service.SkillService;
import com.example.demo.Entity.SkillEntity;
import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillController {

    private final SkillService service;

    public SkillController(SkillService service) {
        this.service = service;
    }

    @PostMapping
    public SkillEntity create(@RequestBody SkillEntity skill) {
        return service.createSkill(skill);
    }

    @PutMapping("/{id}")
    public SkillEntity update(@PathVariable Long id, @RequestBody SkillEntity skill) {
        return service.updateSkill(id, skill);
    }

    @GetMapping
    public List<SkillEntity> getAll() {
        return service.getAllSkills();
    }
}
