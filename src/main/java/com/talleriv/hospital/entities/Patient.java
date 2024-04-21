package com.talleriv.hospital.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter 
public class Patient extends Person {
    @Transient
    private Integer age;
    @CreationTimestamp
    private LocalDate accepted;
    @ManyToMany
    private List<Allergy> allergies;
}
