package com.example.demo;

import com.example.demo.entity.Associate;
import com.example.demo.entity.Skill;
import com.example.demo.repo.AssociateRepo;
import com.example.demo.repo.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class App3Application {
    @Autowired
    AssociateRepo associateRepo;
    @Autowired
    SkillRepo skillRepo;

    public static void main(String[] args) {
        SpringApplication.run(App3Application.class, args);
    }

    /*@Override
    public void run(String... args) throws Exception {
       Associate a=new Associate("shruthi","mail@ibm","9876543212");
      Skill s=new Skill("JAVA");
      Skill s1=new Skill("Python");
      a.add(s);
      a.add(s1);
      associateRepo.save(a);
      skillRepo.save(s);
      skillRepo.save(s1); */






    }
