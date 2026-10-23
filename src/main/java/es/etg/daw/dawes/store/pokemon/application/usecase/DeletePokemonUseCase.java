package es.etg.daw.dawes.store.pokemon.application.usecase;

import es.etg.daw.dawes.store.pokemon.domain.repository.IPokemonRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor 
public class DeletePokemonUseCase {
    private final IPokemonRepository pokemonRepository;
    
    public void delete(int id) {
        pokemonRepository.deleteById(id);
    }
}
