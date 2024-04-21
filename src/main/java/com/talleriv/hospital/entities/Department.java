package com.talleriv.hospital.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.Set;

@Entity
@Getter
@Setter
@SQLDelete(sql = "UPDATE Department SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ManyToOne
    @JsonIgnore
    private Hospital hospital;
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "department")
    //@OneToMany(orphanRemoval = true, mappedBy = "department")
    private Set<Staff> staff;
    private boolean deleted;
}
