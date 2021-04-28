package com.example.demo.service;

import com.example.demo.entity.Associate;
import com.example.demo.entity.Skill;
import org.springframework.stereotype.Component;

import java.util.List;

public interface AssociateService {
    public Associate creatAssociate(Associate associate);
    public Associate addSkill(Skill s);
    public List<Associate> displayUsers();
    public List<Skill> displaySkills();

}
