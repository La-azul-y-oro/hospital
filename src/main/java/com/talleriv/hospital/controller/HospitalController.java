package com.talleriv.hospital.controller;

import com.talleriv.hospital.entities.Hospital;
import com.talleriv.hospital.entities.Staff;
import com.talleriv.hospital.repositories.HospitalRepository;
import com.talleriv.hospital.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    @Autowired
    private HospitalRepository hospitalRepository;

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteHospital(@PathVariable Integer id){
        hospitalRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping
    public ResponseEntity<List<Hospital>> getAll(){
        var list = hospitalRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

}
