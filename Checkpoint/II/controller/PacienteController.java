package com.dh.Checkpoint.II.controller;

import com.dh.Checkpoint.II.persistence.model.Dentista;
import com.dh.Checkpoint.II.persistence.model.Paciente;
import com.dh.Checkpoint.II.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @PostMapping
    public Paciente createPaciente(@RequestBody Paciente paciente) {
        return service.insert(paciente);
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> selectPaciente() {
        return ResponseEntity.ok(service.select());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePaciente(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.ok(("Paciente excluido!!"));
    }

    @PutMapping
    public ResponseEntity<Paciente> updatePaciente(@RequestBody Paciente paciente){
        return ResponseEntity.ok(service.update(paciente));
    }
}
