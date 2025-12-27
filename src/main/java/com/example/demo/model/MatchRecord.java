//sfwqjvswmhqbs


package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "match_records")
public class MatchRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    @ManyToOne
    @JoinColumn(name = "user_a_id")
    private UserProfile userA;

    @ManyToOne
    @JoinColumn(name = "user_b_id")
    private UserProfile userB;

    @ManyToOne
    private Skill skillOfferedByA;

    @ManyToOne
    private Skill skillOfferedByB;

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public UserProfile getUserA() { return userA; }
    public void setUserA(UserProfile userA) { this.userA = userA; }

    public UserProfile getUserB() { return userB; }
    public void setUserB(UserProfile userB) { this.userB = userB; }

    public Skill getSkillOfferedByA() { return skillOfferedByA; }
    public void setSkillOfferedByA(Skill skillOfferedByA) { this.skillOfferedByA = skillOfferedByA; }

    public Skill getSkillOfferedByB() { return skillOfferedByB; }
    public void setSkillOfferedByB(Skill skillOfferedByB) { this.skillOfferedByB = skillOfferedByB; }
}

…………………………..
package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private boolean active = true;

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}

……………………………
package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "skill_offers")
public class SkillOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String experienceLevel;
    private boolean active = true;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserProfile user;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getExperienceLevel() { return experienceLevel; }
    public void setExperienceLevel(String experienceLevel) { this.experienceLevel = experienceLevel; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public UserProfile getUser() { return user; }
    public void setUser(UserProfile user) { this.user = user; }

    public Skill getSkill() { return skill; }
    public void setSkill(Skill skill) { this.skill = skill; }
}

…………………………………….	
package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "skill_requests")
public class SkillRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String urgencyLevel;
    private boolean active = true;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserProfile user;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUrgencyLevel() { return urgencyLevel; }
    public void setUrgencyLevel(String urgencyLevel) { this.urgencyLevel = urgencyLevel; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public UserProfile getUser() { return user; }
    public void setUser(UserProfile user) { this.user = user; }

    public Skill getSkill() { return skill; }
    public void setSkill(Skill skill) { this.skill = skill; }
}

………………………………..
package com.example.demo.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user_profiles")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private boolean active = true;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }

    public Timestamp getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Timestamp updatedAt) { this.updatedAt = updatedAt; }
}