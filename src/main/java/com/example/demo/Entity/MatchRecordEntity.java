package com.example.demo.Entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
public class MatchRecordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UserProfileEntity userA;

    @ManyToOne
    private UserProfileEntity userB;

    @ManyToOne
    private SkillEntity skillOfferedByA;

    @ManyToOne
    private SkillEntity skillOfferedByB;

    private Timestamp matchedAt = new Timestamp(System.currentTimeMillis());

    private String status = "PENDING";
}
