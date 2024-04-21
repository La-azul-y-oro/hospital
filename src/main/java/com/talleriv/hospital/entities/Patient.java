package com.talleriv.hospital.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter 
public class Patient extends Person {
    @Transient
    private Integer age;
    private LocalDate accepted;
    @ManyToMany
    private List<Allergy> allergies;
}
