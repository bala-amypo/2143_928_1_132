package com.example.demo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.sql.Timestamp;

@Entity
public class UserProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Username is required")
    @Size(min = 3, max = 30, message = "Username must be between 3 and 30 characters")
    @Column(unique = true)
    private String username;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Column(unique = true)
    private String email;

    @Size(max = 255, message = "Bio cannot exceed 255 characters")
    private String bio;

    @NotNull
    private Boolean active = true;

    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
    private Timestamp updatedAt = new Timestamp(System.currentTimeMillis());

    public UserProfileEntity() {}
}
