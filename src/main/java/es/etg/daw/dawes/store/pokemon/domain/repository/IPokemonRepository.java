package es.etg.daw.dawes.store.pokemon.domain.repository;

import java.util.List;

import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;

public interface IPokemonRepository {
    List<Pokemon> findAll();

    void deleteById(int id);
    
}
