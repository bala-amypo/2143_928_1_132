package com.example.demo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class SkillEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Skill name is required")
    @Size(min = 2, max = 50, message = "Skill name must be between 2 and 50 characters")
    @Column(unique = true)
    private String name;

    @NotBlank(message = "Category is required")
    private String category;

    @NotBlank(message = "Description is required")
    @Size(max = 255, message = "Description cannot exceed 255 characters")
    private String description;

    @NotNull
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
