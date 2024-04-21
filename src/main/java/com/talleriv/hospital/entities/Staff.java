package com.talleriv.hospital.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Staff extends Person{
    private LocalDate ingreso;
    @ManyToMany
    private List<Certification> certifications;

}
