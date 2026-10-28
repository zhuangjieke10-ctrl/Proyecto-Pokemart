package es.etg.daw.dawes.store.pokemon.application.usecase;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;
import es.etg.daw.dawes.store.pokemon.domain.repository.PokemonRepository;

public class FindPokemonUseCase {

    public PokemonRepository pokemonRepository;
    
    public List<Pokemon> findAll() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(Pokemon.builder().nombre("Bulbsaur").precio(10).tipo("Planta").createdAt(LocalDateTime.now()).build());
        pokemons.add(Pokemon.builder().nombre("Charmander").precio(20).tipo("Fuego").createdAt(LocalDateTime.now()).build());
        pokemons.add(Pokemon.builder().nombre("Squirtle").precio(25).tipo("Agua").createdAt(LocalDateTime.now()).build());

        return pokemonRepository.getAll();
    }
}
