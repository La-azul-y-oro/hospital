package com.talleriv.hospital.entities;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Address {
    private String calle;
    private Integer altura;
}
