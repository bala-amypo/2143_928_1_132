package com.example.barter.model;

import jakarta.persistence.*;

@Entity
public class BarterTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String details;

    // ===== Getters & Setters =====

    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getDetails() {
        return details;
    }
 
    public void setDetails(String details) {
        this.details = details;
    }
}
