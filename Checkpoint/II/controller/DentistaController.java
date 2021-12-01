package com.dh.Checkpoint.II.controller;

import com.dh.Checkpoint.II.persistence.model.Dentista;
import com.dh.Checkpoint.II.service.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("dentista")
public class DentistaController {

    @Autowired
    private DentistaService service;


    @PostMapping
    public ResponseEntity<Dentista> createDentista(@RequestBody Dentista dentista){

        return ResponseEntity.ok(service.insert(dentista));
    }

    @GetMapping
    public ResponseEntity<List<Dentista>> selectDentista(){
        return ResponseEntity.ok(service.select());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDentista(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.ok(("Dentista excluido!!"));
    }

    @PutMapping
    public ResponseEntity<Dentista> updateDentista(@RequestBody Dentista dentista){
        return ResponseEntity.ok(service.update(dentista));
    }



}
