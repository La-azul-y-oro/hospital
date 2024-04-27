package com.talleriv.hospital.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Long phone;
    @Embedded
    private Address address;
    @ManyToMany
    private Set<Patient> patients;
    @OneToMany(mappedBy = "hospital", cascade = CascadeType.REMOVE)
    private Set<Department> departments;
}
