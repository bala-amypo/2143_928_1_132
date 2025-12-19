package com.example.demo.Entity;


import jakarta.persistence.*;


@Entity
public class SkillEntity {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@Column(unique = true)
private String name;


private String category;
private String description;
private Boolean active = true;


public SkillEntity() {}
}