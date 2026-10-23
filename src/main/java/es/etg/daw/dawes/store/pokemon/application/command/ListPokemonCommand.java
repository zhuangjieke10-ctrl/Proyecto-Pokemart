package es.etg.daw.dawes.store.pokemon.application.command;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@AllArgsConstructor
@Accessors(fluent = true)
public class ListPokemonCommand {
    private List<CreatePokemonCommand> pokemons;
}