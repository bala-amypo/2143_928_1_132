package com.example.barter.model;

import jakarta.persistence.*;

@Entity
public class SkillRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private SkillCategory skill;

    private String urgencyLevel;

    private boolean active = true;

    // ===== Getters & Setters =====

    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public User getUser() {
        return user;
    }
 
    public void setUser(User user) {
        this.user = user;
    }
 
    public SkillCategory getSkill() {
        return skill;
    }
 
    public void setSkill(SkillCategory skill) {
        this.skill = skill;
    }
 
    public String getUrgencyLevel() {
        return urgencyLevel;
    }
 
    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }
 
    public boolean isActive() {
        return active;
    }
 
    public void setActive(boolean active) {
        this.active = active;
    }
}
