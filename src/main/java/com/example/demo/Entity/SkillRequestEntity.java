package com.example.demo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class SkillRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "User must not be null")
    @ManyToOne
    private UserProfileEntity user;

    @NotNull(message = "Skill must not be null")
    @ManyToOne
    private SkillEntity skill;

    @NotBlank(message = "Urgency level is required")
    private String urgencyLevel;

    @NotNull
    private Boolean active = true;

    public SkillRequestEntity() {}
}
