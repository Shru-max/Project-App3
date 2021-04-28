package com.example.demo.service;

import com.example.demo.entity.Associate;
import com.example.demo.entity.Skill;
import com.example.demo.repo.AssociateRepo;
import com.example.demo.repo.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssociateServiceImpl implements  AssociateService{
AssociateRepo associateRepo;
SkillRepo skillRepo;
Associate associate;
@Autowired
    public AssociateServiceImpl(AssociateRepo associateRepo, SkillRepo skillRepo) {
        this.associateRepo = associateRepo;
        this.skillRepo = skillRepo;

    }



    @Override
    public Associate creatAssociate(Associate ass) {
       return associateRepo.save(ass);
    }

    @Override
    public Associate addSkill(Skill s) {

    skillRepo.save(s);
        associate.add(s);
        return associate;
    }

    @Override
    public List<Associate> displayUsers() {
       return associateRepo.findAll();
    }

    @Override
    public List<Skill> displaySkills() {
    return skillRepo.findAll();


    }
}
