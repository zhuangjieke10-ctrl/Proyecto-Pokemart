package es.etg.daw.dawes.store.pokemon.application.usecase;

import java.time.LocalDateTime;
import java.util.Optional;

import es.etg.daw.dawes.store.pokemon.application.command.EditPokemonCommand;
import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;
import es.etg.daw.dawes.store.pokemon.domain.repository.PokemonRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor 
public class EditPokemonUseCase {

    public PokemonRepository pokemonRepository;
    
    public Pokemon update(EditPokemonCommand command) {
    Optional <Pokemon> resultado = pokemonRepository.getById(command.id());

    if (resultado.get() != null) {
        Pokemon pokemon = resultado.get();

        pokemon.setFoto(command.foto());
        pokemon.setPrecio(command.precio());
        pokemon.setNombre(command.nombre());
        pokemon.setTipo(command.tipo());

        return pokemonRepository.save(pokemon);
    }

    return null;
    }
}

