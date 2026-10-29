package es.etg.daw.dawes.store.pokemon.application.usecase;

import java.util.Optional;

import es.etg.daw.dawes.store.pokemon.domain.error.EntityNotFoundException.PokemonNotFoundException;
import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;
import es.etg.daw.dawes.store.pokemon.domain.repository.PokemonRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor   
public class DeletePokemonUseCase {
    public PokemonRepository pokemonRepository;
    
    public void delete(int id) {

    Optional <Pokemon> resultado = pokemonRepository.getById(id);

        if (resultado.isEmpty())
            throw new PokemonNotFoundException();
        
    pokemonRepository.deleteById(id);
        
    }
}