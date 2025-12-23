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

    public Long getId() {
        return id;
    }

    public String getName() {     // ✅ REQUIRED
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() { // ✅ REQUIRED
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() { // ✅ REQUIRED
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }
}
