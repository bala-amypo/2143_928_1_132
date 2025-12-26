package com.example.barter.model;

import jakarta.persistence.*;

@Entity
public class SkillOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private SkillCategory skill;

    private String experienceLevel;

    private Integer availableHoursPerWeek;

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
 
    public String getExperienceLevel() {
        return experienceLevel;
    }
 
    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }
 
    public Integer getAvailableHoursPerWeek() {
        return availableHoursPerWeek;
    }
 
    public void setAvailableHoursPerWeek(Integer availableHoursPerWeek) {
        this.availableHoursPerWeek = availableHoursPerWeek;
    }
 
    public boolean isActive() {
        return active;
    }
 
    public void setActive(boolean active) {
        this.active = active;
    }
}
