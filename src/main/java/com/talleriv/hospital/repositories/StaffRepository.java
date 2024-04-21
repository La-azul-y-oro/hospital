package com.talleriv.hospital.repositories;

import com.talleriv.hospital.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
}
