package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.UserProfileEntity;

public interface UserProfileRepo extends JpaRepository<UserProfileEntity, Long> {
}
