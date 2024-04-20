package com.talleriv.hospital.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Staff extends Person{
    private Date ingreso;
    @ManyToMany
    private List<Certification> certifications;

}
