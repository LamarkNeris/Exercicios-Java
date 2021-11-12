package com.DH.Aula21.controller;

import com.DH.Aula21.dao.PokemonDAO;
import com.DH.Aula21.domain.Pokemon;
import com.DH.Aula21.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("pokemon")
public class PokemonController {

    @Autowired
    private PokemonService service;

    @GetMapping
    public Map<Integer, Pokemon> getPokemon(){
        return service.buscarPokemon();
    }
    @PostMapping
    public Pokemon postPokemon(@RequestBody Pokemon dao){
        return service.criarPokemon(dao);
    }
    @PutMapping
    public Pokemon putPokemon(@RequestBody PokemonDAO dao){
        return service.editarPokemon(dao);
    }
}
