package com.pogostats.service;

import com.pogostats.entity.Pokemon;
import com.pogostats.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService {

   @Autowired
   PokemonRepository pokemonRepository;

    @Override
    public List<Pokemon> findByPokedexNumber(int pokedexNumber) {
        return pokemonRepository.findAll();
    }
}
