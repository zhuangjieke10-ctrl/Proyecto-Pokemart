package es.etg.daw.dawes.store.pokemon.infraestructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import es.etg.daw.dawes.store.pokemon.application.usecase.CreatePokemonUseCase;
import es.etg.daw.dawes.store.pokemon.application.usecase.DeletePokemonUseCase;
import es.etg.daw.dawes.store.pokemon.application.usecase.FindPokemonUseCase;
import es.etg.daw.dawes.store.pokemon.domain.repository.IPokemonRepository;
import lombok.RequiredArgsConstructor;

@Configuration 
@RequiredArgsConstructor 
public class PokemonConfig {

    @Bean
    public CreatePokemonUseCase createPokemonUseCase() {
        return new CreatePokemonUseCase();
    }

    @Bean
    public FindPokemonUseCase findPokemonUseCase( IPokemonRepository pokemonRepository) {

        return new FindPokemonUseCase(pokemonRepository);
    }

    @Bean
    public DeletePokemonUseCase deletePokemonUseCase(IPokemonRepository pokemonRepository) {

        return new DeletePokemonUseCase(pokemonRepository);
    }
}