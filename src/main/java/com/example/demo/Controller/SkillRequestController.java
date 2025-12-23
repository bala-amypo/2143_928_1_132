package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.Service.SkillRequestService;
import com.example.demo.Entity.SkillRequestEntity;
import java.util.List;

@RestController
@RequestMapping("/api/skill-requests")
public class SkillRequestController {

    private final SkillRequestService service;

    public SkillRequestController(SkillRequestService service) {
        this.service = service;
    }

    @PostMapping
    public SkillRequestEntity create(@Valid @RequestBody SkillRequestEntity request) {
        return service.createRequest(request);
    }

    @GetMapping("/{id}")
    public SkillRequestEntity getById(@PathVariable Long id) {
        return service.getRequestById(id);
    }

    @GetMapping("/user/{userId}")
    public List<SkillRequestEntity> getByUser(@PathVariable Long userId) {
        return service.getRequestsByUser(userId);
    }
}
