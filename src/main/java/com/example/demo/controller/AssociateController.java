package com.example.demo.controller;

import com.example.demo.entity.Associate;
import com.example.demo.entity.Skill;
import com.example.demo.repo.AssociateRepo;
import com.example.demo.repo.SkillRepo;
import com.example.demo.service.AssociateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AssociateController {

    AssociateService associateService;
    AssociateRepo associateRepo;
    SkillRepo skillRepo;
@Autowired
    public AssociateController(AssociateService associateService, AssociateRepo associateRepo, SkillRepo skillRepo) {
        this.associateService = associateService;
        this.associateRepo = associateRepo;
        this.skillRepo = skillRepo;
    }


    @PostMapping("/createuser")
    public ResponseEntity<Associate> createAssociate(@RequestBody Associate associate)

    {
        return ResponseEntity.status(HttpStatus.CREATED).body(associateService.creatAssociate(associate));

    }
    @PostMapping("/addskill/{id}")
    public Optional<Associate> addSkills(@PathVariable Integer id,@RequestBody Skill skill)
    {
        Optional ass=associateRepo.findById(id);
        if(ass==null)
        {
            System.out.println("No such user");
        }
        else
        {
            associateService.addSkill(skill);
        }
        return ass;
    }
    @GetMapping("/displayusers")
    public ResponseEntity<List<Associate>> displayassosciates()
    {
        return ResponseEntity.ok(associateService.displayUsers());
    }
    @GetMapping("/displayskills")
    public ResponseEntity<List<Skill>> displayskills()
    {
        return ResponseEntity.ok(associateService.displaySkills());
    }

}
