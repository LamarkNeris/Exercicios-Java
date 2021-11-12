package com.DH.Aula21.service;


import com.DH.Aula21.dao.PokemonDAO;
import com.DH.Aula21.domain.Pokemon;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PokemonService {
    private static Map<Integer, Pokemon> flyweight = new HashMap<>();

    public Map<Integer, Pokemon> buscarPokemon(){
        return flyweight;
    }
    public Pokemon criarPokemon(Pokemon dao){
        Integer id = flyweight.size() +1;
        Pokemon pokemon = new Pokemon(dao.getNome(), dao.getTipo(), dao.getPokedex(), dao.getHabilidade());

        flyweight.put(id, pokemon);

        return flyweight.get(id);
    }
    public Pokemon editarPokemon(PokemonDAO dao){
        Pokemon pokemon = flyweight.get(dao.getId());

        pokemon.setTipo(dao.getTipo());
        pokemon.setHabilidade(dao.getHabilidades());

        return pokemon;
    }
}
