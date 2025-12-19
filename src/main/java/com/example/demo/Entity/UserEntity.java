package com.example.demo.Entity;


import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "users")
public class UserEntity {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


private String fullName;


@Column(unique = true)
private String email;


private String password;


private String role = "MONITOR";


private LocalDateTime createdAt = LocalDateTime.now();


public UserEntity() {}


// getters and setters
}