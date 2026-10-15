package es.etg.daw.dawes.store.pokemon.application.usecase;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;

public class FindPokemonUseCase {
    //Queremos retornar tres pokémons estáticos, lo mejor es hacerlos aquí directamente y retornarlos, con un builder, como se hizo en CreatePokemonUseCase
    public List<Pokemon> findAll() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(Pokemon.builder().nombre("Bulbsaur").precio(10).tipo("Planta").createdAt(LocalDateTime.now()).build());
        pokemons.add(Pokemon.builder().nombre("Charmander").precio(20).tipo("Fuego").createdAt(LocalDateTime.now()).build());
        pokemons.add(Pokemon.builder().nombre("Squirtle").precio(25).tipo("Agua").createdAt(LocalDateTime.now()).build());

        return pokemons;
    }
}
