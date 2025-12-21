package com.example.demo.Entity;


import jakarta.persistence.*;
import java.sql.Timestamp;


@Entity
public class UserProfileEntity {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@Column(unique = true)
private String username;


@Column(unique = true)
private String email;


private String bio;


private Boolean active = true;


private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
private Timestamp updatedAt = new Timestamp(System.currentTimeMillis());


public UserProfileEntity() {}
}