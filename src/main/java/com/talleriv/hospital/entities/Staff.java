package com.talleriv.hospital.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Staff extends Person{
    private Date ingreso;
    private String certificaciones;
}
