package es.etg.daw.dawes.store.pokemon.application.usecase;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import es.etg.daw.dawes.store.pokemon.application.command.CreatePokemonCommand;
import es.etg.daw.dawes.store.pokemon.application.command.ListPokemonCommand;
import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;

public class FindPokemonUseCase {
    public List<Pokemon> findAll(ListPokemonCommand comando) {
        List<Pokemon> pokemons = new ArrayList<>();

        for (CreatePokemonCommand pokemon : comando.pokemons()) {
            pokemons.add(Pokemon.builder()
                    .nombre(pokemon.nombre())
                    .tipo(pokemon.tipo())
                    .foto(pokemon.foto())
                    .precio(pokemon.precio())
                    .createdAt(LocalDateTime.now())
                    .build());
        }
        return pokemons;
    }
}