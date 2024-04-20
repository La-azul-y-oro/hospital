package com.talleriv.hospital.entities;

import java.util.Date;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
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
    private String primerNombre;
    private String segundoNombre;
    private String apellido;
    private transient String nombreCompleto;
    private Date fechaNac;
    private Gender genero;
    @Embedded
    private Address direccion;
    @ManyToMany(mappedBy = "people")
    private Set<Hospital> hospitals;
}
