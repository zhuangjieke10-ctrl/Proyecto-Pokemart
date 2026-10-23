package es.etg.daw.dawes.store.pokemon.infraestructure.persistence;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;
import es.etg.daw.dawes.store.pokemon.domain.repository.IPokemonRepository;

    
@Repository 
public class InMemoryPokemonRepository implements IPokemonRepository{

    private final List<Pokemon> pokemons = new ArrayList<>();
    
     public InMemoryPokemonRepository() {

        pokemons.add(Pokemon.builder()
                .id(1)
                .nombre("Bulbasaur")
                .tipo("Planta")
                .precio(10)
                .createdAt(LocalDateTime.now())
                .build());

        pokemons.add(Pokemon.builder()
                .id(2)
                .nombre("Charmander")
                .tipo("Fuego")
                .precio(20)
                .createdAt(LocalDateTime.now())
                .build());

        pokemons.add(Pokemon.builder()
                .id(3)
                .nombre("Squirtle")
                .tipo("Agua")
                .precio(25)
                .createdAt(LocalDateTime.now())
                .build());
    }

    @Override

    public List<Pokemon> findAll() {
        return pokemons;
    }

    @Override

    public void deleteById(int id) {

    }

    
  }
