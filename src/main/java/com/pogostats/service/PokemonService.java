package com.pogostats.service;

import com.pogostats.entity.Pokemon;

import java.util.List;

public interface PokemonService {

    public List<Pokemon> findByPokedexNumber(int pokedexNumber);

}
