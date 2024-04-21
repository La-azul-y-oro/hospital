package com.talleriv.hospital.controller;

import com.talleriv.hospital.entities.Staff;
import com.talleriv.hospital.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private StaffRepository staffRepository;

    @PostMapping
    public ResponseEntity<Void> createStaff(@RequestBody Staff staff){
        staffRepository.save(staff);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
