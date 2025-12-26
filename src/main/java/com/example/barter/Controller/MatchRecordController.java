package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.Service.MatchRecordService;
import com.example.demo.Entity.MatchRecordEntity;
import java.util.List;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/matches")
public class MatchRecordController {

    private final MatchRecordService service;

    public MatchRecordController(MatchRecordService service) {
        this.service = service;
    }

    @PostMapping("/generate/{userId}")
    public MatchRecordEntity generate(@PathVariable Long userId) {
        return service.generateMatch(userId);
    }

    @GetMapping("/{id}")
    public MatchRecordEntity getById(@PathVariable Long id) {
        return service.getMatchById(id);
    }

    @GetMapping("/user/{userId}")
    public List<MatchRecordEntity> getByUser(@PathVariable Long userId) {
        return service.getMatchesForUser(userId);
    }
}
