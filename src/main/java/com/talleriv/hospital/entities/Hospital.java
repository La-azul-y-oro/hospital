package com.talleriv.hospital.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.Set;

@Getter
@Setter
@Entity
@SQLDelete(sql = "UPDATE Hospital SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
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
    // @OneToMany(mappedBy = "hospital", orphanRemoval = true)
    private Set<Department> departments;
    private boolean deleted;
}
