package com.example.demo.Entity;


@Entity
public class UserProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Username is required")
    @Size(min = 3, max = 20)
    @Column(unique = true)
    private String username;

    @Email
    @NotBlank
    @Column(unique = true)
    private String email;

    @Size(max = 250, message = "Bio should not exceed 250 characters")
    private String bio;

    @NotNull
    private Boolean active = true;

    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
    private Timestamp updatedAt = new Timestamp(System.currentTimeMillis());


private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
private Timestamp updatedAt = new Timestamp(System.currentTimeMillis());


public UserProfileEntity() {}
}