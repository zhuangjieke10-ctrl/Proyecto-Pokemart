package es.etg.daw.dawes.store.pokemon.application.usecase;

import java.util.List;

import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;
import es.etg.daw.dawes.store.pokemon.domain.repository.IPokemonRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FindPokemonUseCase {
    
        private final IPokemonRepository pokemonRepository;
        
        public List<Pokemon> findAll() {
        return pokemonRepository.findAll();
    }
    }

