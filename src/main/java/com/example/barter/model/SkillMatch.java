package com.example.barter.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
public class SkillMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User userA;

    @ManyToOne
    private User userB;

    @ManyToOne
    private SkillCategory skillOfferedByA;

    @ManyToOne
    private SkillCategory skillOfferedByB;

    private String status = "PENDING";

    private Timestamp matchedAt;

    // ===== Getters & Setters =====

    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public User getUserA() {
        return userA;
    }
 
    public void setUserA(User userA) {
        this.userA = userA;
    }
 
    public User getUserB() {
        return userB;
    }
 
    public void setUserB(User userB) {
        this.userB = userB;
    }
 
    public SkillCategory getSkillOfferedByA() {
        return skillOfferedByA;
    }
 
    public void setSkillOfferedByA(SkillCategory skillOfferedByA) {
        this.skillOfferedByA = skillOfferedByA;
    }
 
    public SkillCategory getSkillOfferedByB() {
        return skillOfferedByB;
    }
 
    public void setSkillOfferedByB(SkillCategory skillOfferedByB) {
        this.skillOfferedByB = skillOfferedByB;
    }
 
    public String getStatus() {
        return status;
    }
 
    public void setStatus(String status) {
        this.status = status;
    }
 
    public Timestamp getMatchedAt() {
        return matchedAt;
    }
 
    public void setMatchedAt(Timestamp matchedAt) {
        this.matchedAt = matchedAt;
    }
}
