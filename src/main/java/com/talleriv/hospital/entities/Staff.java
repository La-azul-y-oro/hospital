package com.talleriv.hospital.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Staff extends Person{
    @CreationTimestamp
    private LocalDate joined;
    @ManyToMany
    private List<Certification> certifications;
    @ManyToOne
    private Department department;
}
