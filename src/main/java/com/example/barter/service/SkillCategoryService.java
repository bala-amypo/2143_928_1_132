package com.example.barter.service;

import com.example.barter.model.SkillCategory;
import java.util.List;

public interface SkillCategoryService {

    SkillCategory create(SkillCategory category);

    List<SkillCategory> getAll();
}
