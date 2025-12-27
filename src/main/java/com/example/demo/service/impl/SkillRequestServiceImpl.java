package com.example.demo.service.impl;

import com.example.demo.model.SkillRequest;
import com.example.demo.service.SkillRequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillRequestServiceImpl implements SkillRequestService {

    @Override
    public SkillRequest createRequest(SkillRequest request) {
        return request;
    }

    @Override
    public SkillRequest getRequestById(Long id) {
        return new SkillRequest();
    }

    @Override
    public List<SkillRequest> getRequestsByUser(Long userId) {
        return List.of();
    }
}

// ………………………………….
package com.example.demo.service.impl;

import com.example.demo.model.Skill;
import com.example.demo.service.SkillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    @Override
    public Skill updateSkill(Long id, Skill skill) {
        return skill;
    }

    @Override
    public List<Skill> getAllSkills() {
        return List.of();
    }
}

………………………………..
package com.example.demo.service.impl;

import com.example.demo.model.UserProfile;
import com.example.demo.service.UserProfileService;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Override
    public UserProfile createUser(UserProfile profile) {
        return profile;
    }

    @Override
    public UserProfile getUserById(Long id) {
        return new UserProfile();
    }

    @Override
    public void deactivateUser(Long id) {
        // no-op
    }
}

…………………………..
package com.example.demo.service.impl;

import com.example.demo.model.AppUser;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public AppUser findByEmail(String email) {
        return new AppUser();
    }
}

………………………