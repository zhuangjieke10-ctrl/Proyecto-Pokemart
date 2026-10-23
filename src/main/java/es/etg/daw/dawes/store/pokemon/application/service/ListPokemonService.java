package es.etg.daw.dawes.store.pokemon.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.etg.daw.dawes.store.pokemon.application.usecase.FindPokemonUseCase;
import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor 
@Service 
public class ListPokemonService {
    private final FindPokemonUseCase findPokemonUseCase;

    public List<Pokemon> listarPokemons() {
        List<Pokemon> pokemons = findPokemonUseCase.findAll();
        return pokemons;
    }
}
