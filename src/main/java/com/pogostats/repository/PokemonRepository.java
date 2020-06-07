package com.pogostats.repository;

import com.pogostats.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

    List<Pokemon> findByPokedexNumber(Integer pokedexNumber);
}
