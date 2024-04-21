package com.talleriv.hospital.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String firstName;
    private String secondName;
    private String lastName;
    @Transient
    private String fullName;
    private LocalDate birthdate;
    private Gender gender;
    @Embedded
    private Address address;
    @ManyToMany(mappedBy = "people")
    private Set<Hospital> hospitals;
}
