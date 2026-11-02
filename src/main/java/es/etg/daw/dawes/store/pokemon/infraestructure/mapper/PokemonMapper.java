package es.etg.daw.dawes.store.pokemon.infraestructure.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import es.etg.daw.dawes.store.pokemon.application.command.CreatePokemonCommand;
import es.etg.daw.dawes.store.pokemon.application.command.EditPokemonCommand;
import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;
import es.etg.daw.dawes.store.pokemon.infraestructure.web.mvc.dto.PokemonRequest;
import es.etg.daw.dawes.store.pokemon.infraestructure.web.mvc.dto.PokemonResponse;


@Mapper(componentModel = "spring")
public interface PokemonMapper {

    CreatePokemonCommand toCommand(PokemonRequest request);

    PokemonResponse toResponse(Pokemon pokemon);

    @Mapping(source = "id", target = "id")
    EditPokemonCommand toCommand(int id, PokemonRequest request);
}