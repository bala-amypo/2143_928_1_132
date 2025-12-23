package com.example.demo.Entity;

import jakarta.validation.constraints.NotBlank;

@Entity
public class SkillEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Skill name is required")
    @Column(unique = true)
    private String name;

    @NotBlank(message = "Category is required")
    private String category;

    private String description;
    private Boolean active = true;

    // getters & setters
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
