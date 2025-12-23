package com.example.demo.Entity;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

@Entity
public class UserProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Username required")
    @Column(unique = true)
    private String username;

    @Email
    @NotBlank(message = "Email required")
    @Column(unique = true)
    private String email;

    private String bio;
    private Boolean active = true


private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
private Timestamp updatedAt = new Timestamp(System.currentTimeMillis());


public UserProfileEntity() {}
}