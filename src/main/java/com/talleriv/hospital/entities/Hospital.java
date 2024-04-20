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
    private Integer phone;
    @Embedded
    private Address address;

    @ManyToMany
    private Set<Person> people;

    @OneToMany(mappedBy = "hospital")
    private Set<Department> departments;
}
