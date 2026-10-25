package es.etg.daw.dawes.store.pokemon.infraestructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.etg.daw.dawes.store.pokemon.application.usecase.CreatePokemonUseCase;
import es.etg.daw.dawes.store.pokemon.application.usecase.FindPokemonUseCase;
import es.etg.daw.dawes.store.pokemon.application.usecase.DeletePokemonUseCase;
import es.etg.daw.dawes.store.pokemon.application.usecase.EditPokemonUseCase;

@Configuration
public class PokemonConfig {

    @Bean
    public CreatePokemonUseCase createPokemonUseCase() {
        return new CreatePokemonUseCase();
    }

    @Bean
    public FindPokemonUseCase findPokemonUseCase() {
        return new FindPokemonUseCase();
    }

    @Bean
    public DeletePokemonUseCase deletePokemonUseCase() {
        return new DeletePokemonUseCase();
    }

    @Bean
    public EditPokemonUseCase editPokemonUseCase() {
        return new EditPokemonUseCase();
    }
}