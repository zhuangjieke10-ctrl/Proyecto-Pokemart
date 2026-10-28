package es.etg.daw.dawes.store.pokemon.application.usecase;

import java.time.LocalDateTime;

import es.etg.daw.dawes.store.pokemon.application.command.EditPokemonCommand;
import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;
import es.etg.daw.dawes.store.pokemon.domain.repository.PokemonRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor 
public class EditPokemonUseCase {

    public PokemonRepository pokemonRepository;
    
    public Pokemon update(EditPokemonCommand command) {
        Pokemon pokemon = new  Pokemon(command.id(), null, null, command.foto(), command.precio(), LocalDateTime.now());
        return pokemonRepository.save(pokemon);
    }
}
