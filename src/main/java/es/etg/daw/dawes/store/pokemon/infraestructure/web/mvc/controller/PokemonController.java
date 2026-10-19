package es.etg.daw.dawes.store.pokemon.infraestructure.web.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import es.etg.daw.dawes.store.pokemon.application.command.CreatePokemonCommand;
import es.etg.daw.dawes.store.pokemon.application.service.CreatePokemonService;
import es.etg.daw.dawes.store.pokemon.application.service.ListPokemonService;
import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;
import es.etg.daw.dawes.store.pokemon.infraestructure.mapper.PokemonMapper;
import es.etg.daw.dawes.store.pokemon.infraestructure.web.mvc.dto.PokemonRequest;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller 
@RequestMapping ("/pokemons") //URL será /pokemons
@RequiredArgsConstructor 

public class PokemonController {

    private final CreatePokemonService createPokemonService;
    private final ListPokemonService listPokemonService;


   //Nuevo método, como solo veremos información, y no la daremos como con createPokemon, es un GetMapping
    @GetMapping("/lista")
    @ResponseBody 
    //Vamos a retornar un JSON de los Pokemons, en formato PokemonResponse
    public String listPokemon() {
      //Sacamos los Pokemons de la lista
      List<Pokemon> pokemons = listPokemonService.listarPokemons();

      StringBuilder html = new StringBuilder();
      html.append(
        """
        <html>
          <body>
        """
      );

      //Por cada Pokemon que haya en la lista de pokemons, lo añadiremos a la lista de responses formateandolo en el  mapper
      for (Pokemon pokemon : pokemons) {
          html.append(
            """
              <div>
                <p>ID: %s</p>
                <p>Nombre: %s</p>
                <p>Tipo: %s</p>
                <p>Precio: %s</p>
                <p>Fecha creada: %s</p>
              </div>
            """.formatted(pokemon.getId(), pokemon.getNombre(), pokemon.getTipo(), pokemon.getPrecio(), pokemon.getCreatedAt())
          );
      }
      html.append(
          """
                  </body>
              </html>
          """
          return html.toString();
      );

    @PostMapping
    @ResponseBody
    public String createPokemon(PokemonRequest request) {
        CreatePokemonCommand commando = PokemonMapper.toCommand(request);

        Pokemon pokemon = createPokemonService.createPokemon(commando);
        
        return """
            <!DOCTYPE html>
            <html lang="es">
              <head>
                <meta charset="UTF-8">
                <title>Producto</title>
              </head>
              <body>
                <h1>Pokemon: %s - %s</h1>
                <p>Tipo: %s </p>
                <p>Precio: %s </p>
                <p>Creado el: %s </p>
              </body>
            </html>
            """.formatted(pokemon.getId(), pokemon.getNombre(), pokemon.getTipo(), pokemon.getPrecio(), pokemon.getCreatedAt());
    }
}
