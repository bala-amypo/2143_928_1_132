package com.example.demo.Entity;

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

    @NotBlank(message = "Description is required")
    @Size(max = 200)
    private String description;

    @NotNull
    private Boolean active = true;


    public SkillEntity() {}

    public Long getId() {
        return id;
    }

    public String getName() {     
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() { 
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() { 
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }
}
