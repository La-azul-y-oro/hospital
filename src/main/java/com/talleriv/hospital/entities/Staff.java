package com.talleriv.hospital.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@SQLDelete(sql = "UPDATE Staff SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
public class Staff extends Person{
    @CreationTimestamp
    private LocalDate joined;
    @ManyToMany
    private List<Certification> certifications;
    @ManyToOne
    @JsonIgnore
    private Department department;
    private boolean deleted;
}
