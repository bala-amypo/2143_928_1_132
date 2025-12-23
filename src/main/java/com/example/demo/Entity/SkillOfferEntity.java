package com.example.demo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class SkillOfferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "User must not be null")
    @ManyToOne
    private UserProfileEntity user;

    @NotNull(message = "Skill must not be null")
    @ManyToOne
    private SkillEntity skill;

    @NotBlank(message = "Experience level is required")
    private String experienceLevel;

    @NotNull(message = "Available hours per week is required")
    @Min(value = 1, message = "Available hours must be at least 1")
    private Integer availableHoursPerWeek;

    @NotNull
    private Boolean active = true;

    public SkillOfferEntity() {}
}
