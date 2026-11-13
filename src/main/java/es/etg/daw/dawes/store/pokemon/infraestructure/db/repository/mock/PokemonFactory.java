package es.etg.daw.dawes.store.pokemon.infraestructure.db.repository.mock;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;

public class PokemonFactory {
    

    public static final Map<Integer, Pokemon> getDemoData(){
        Map<Integer, Pokemon> datos = new LinkedHashMap<>();

        datos.put(1, new Pokemon(1, "Bulbsaur","Planta","1", 10, LocalDateTime.now()));
        datos.put(2, new Pokemon(2, "Charmander","Fuego","2", 10, LocalDateTime.now()));
        datos.put(3, new Pokemon(3, "Squirtle","Agua","3", 10, LocalDateTime.now()));


        return datos;
    }
}
