package com.example.demo.Entity;


import jakarta.persistence.*;


@Entity
public class SkillRequestEntity {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@ManyToOne
private UserProfileEntity user;


@ManyToOne
private SkillEntity skill;


private String urgencyLevel;
private Boolean active = true;


public SkillRequestEntity() {}
}