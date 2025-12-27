//kuegduydfpackage com.example.demo.controller;

import com.example.demo.model.MatchRecord;
import com.example.demo.service.MatchmakingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matches")
public class MatchRecordController {

    private final MatchmakingService matchmakingService;

    public MatchRecordController(MatchmakingService matchmakingService) {
        this.matchmakingService = matchmakingService;
    }

    @PostMapping("/{userId}")
    public ResponseEntity<MatchRecord> generate(@PathVariable Long userId) {
        return ResponseEntity.ok(matchmakingService.generateMatch(userId));
    }
}………………………………….
package com.example.demo.controller;

import com.example.demo.model.Skill;
import com.example.demo.service.SkillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Skill> update(@PathVariable Long id, @RequestBody Skill skill) {
        return ResponseEntity.ok(skillService.updateSkill(id, skill));
    }

    @GetMapping
    public ResponseEntity<List<Skill>> list() {
        return ResponseEntity.ok(skillService.getAllSkills());
    }
}
………………………….
package com.example.demo.controller;

import com.example.demo.model.SkillOffer;
import com.example.demo.service.SkillOfferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/offers")
public class SkillOfferController {

    private final SkillOfferService skillOfferService;

    public SkillOfferController(SkillOfferService skillOfferService) {
        this.skillOfferService = skillOfferService;
    }

    @PostMapping
    public ResponseEntity<SkillOffer> create(@RequestBody SkillOffer offer) {
        return ResponseEntity.ok(skillOfferService.createOffer(offer));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SkillOffer> get(@PathVariable Long id) {
        return ResponseEntity.ok(skillOfferService.getOfferById(id));
    }