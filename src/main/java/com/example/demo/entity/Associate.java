package com.example.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import com.example.demo.entity.Skill;

@Entity
@Table(name="ASSOCIATE_DETAILS")
public class Associate {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="associate_id")
    private Integer associateId;
    @Column(name="Name")
    private String associateName;
    @Column(name="Email")
    private String associateMail;
    @Column(name="Phone")
    private String associatePhone;
    @OneToMany(mappedBy="associate",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    private List<Skill> skills;

    public Associate() {
    }

    public Associate(String associateName, String associateMail, String associatePhone) {
       //this.associateId = associateId;
        this.associateName = associateName;
        this.associateMail = associateMail;
        this.associatePhone = associatePhone;
        this.skills = skills;
    }

    public Integer getAssociateId() {
        return associateId;
    }

    public void setAssociateId(Integer associateId) {
        this.associateId = associateId;
    }

    public String getAssociateName() {
        return associateName;
    }

    public void setAssociateName(String associateName) {
        this.associateName = associateName;
    }

    public String getAssociateMail() {
        return associateMail;
    }

    public void setAssociateMail(String associateMail) {
        this.associateMail = associateMail;
    }

    public String getAssociatePhone() {
        return associatePhone;
    }

    public void setAssociatePhone(String associatePhone) {
        this.associatePhone = associatePhone;
    }

    @Override
    public String toString() {
        return "Associate{" +
                "associateId=" + associateId +
                ", associateName='" + associateName + '\'' +
                ", associateMail='" + associateMail + '\'' +
                ", associatePhone='" + associatePhone + '\'' +
                ", skills=" + skills +
                '}';
    }


    public void add(Skill tempSkill) {

        if (skills == null) {
            skills = new ArrayList<>();
        }

        skills.add(tempSkill);

        tempSkill.setAssociate(this);
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
