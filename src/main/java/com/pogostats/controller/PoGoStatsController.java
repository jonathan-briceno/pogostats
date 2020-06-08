package com.pogostats.controller;


import com.pogostats.entity.Pokemon;
import com.pogostats.service.PikaService;
import com.pogostats.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pokemon")
public class PoGoStatsController {

    @Autowired
    PikaService pikaService;

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/pika/{pikaTimes}")
    public String getPika(@PathVariable("pikaTimes") int pikaTimes) {
        return pikaService.getPika(pikaTimes);
    }

    @GetMapping("/catch/{pokedexNumber}")
    public List<Pokemon> findByPokedexNumber(@PathVariable("pokedexNumber") int pokedexNumber) {
        return pokemonService.findByPokedexNumber(pokedexNumber);
    }

}
