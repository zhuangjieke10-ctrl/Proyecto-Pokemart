package es.etg.daw.dawes.store.pokemon.infraestructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.etg.daw.dawes.store.pokemon.application.usecase.CreatePokemonUseCase;
import es.etg.daw.dawes.store.pokemon.application.usecase.FindPokemonUseCase;
import lombok.RequiredArgsConstructor;

@Configuration 
@RequiredArgsConstructor 
public class PokemonConfig {

    @Bean 
    public CreatePokemonUseCase createPokemonUseCase(){
        return new CreatePokemonUseCase();
    }

    @Bean 
    public FindPokemonUseCase findPokemonUseCase() {
        return new  FindPokemonUseCase();
    }

    
}