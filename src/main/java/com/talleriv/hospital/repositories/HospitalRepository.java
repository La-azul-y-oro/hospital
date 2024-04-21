package com.talleriv.hospital.repositories;

import com.talleriv.hospital.entities.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
}
