package com.talleriv.hospital.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter 
public class Paciente extends Person {
    private Integer edad;
    private Date accepted;
    @ManyToMany
    private List<Allergy> allergies;
}
