package com.example.demo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
public class MatchRecordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "User A must not be null")
    @ManyToOne
    private UserProfileEntity userA;

    @NotNull(message = "User B must not be null")
    @ManyToOne
    private UserProfileEntity userB;

    @NotNull(message = "Skill offered by User A must not be null")
    @ManyToOne
    private SkillEntity skillOfferedByA;

    @NotNull(message = "Skill offered by User B must not be null")
    @ManyToOne
    private SkillEntity skillOfferedByB;

    @NotNull
    private Timestamp matchedAt = new Timestamp(System.currentTimeMillis());

    @NotNull(message = "Status must not be null")
    private String status = "PENDING";
}
