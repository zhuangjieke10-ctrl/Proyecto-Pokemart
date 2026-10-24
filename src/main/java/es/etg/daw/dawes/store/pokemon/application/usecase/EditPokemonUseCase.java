package es.etg.daw.dawes.store.pokemon.application.usecase;

import java.time.LocalDateTime;

import es.etg.daw.dawes.store.pokemon.application.command.EditPokemonCommand;
import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;

public class EditPokemonUseCase {
    public Pokemon update(EditPokemonCommand command) {
        Pokemon pokemon = new  Pokemon(command.id(), null, null, command.foto(), command.precio(), LocalDateTime.now());
        return pokemon;
    }
}
