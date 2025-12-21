package com.example.demo.Entity;


import jakarta.persistence.*;


@Entity
public class SkillOfferEntity {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@ManyToOne
private UserProfileEntity user;


@ManyToOne
private SkillEntity skill;


private String experienceLevel;
private Integer availableHoursPerWeek;
private Boolean active = true;


public SkillOfferEntity() {}
}