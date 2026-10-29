package es.etg.daw.dawes.store.pokemon.domain.error.EntityNotFoundException;

public class PokemonNotFoundException extends EntityNotFoundException{
    
    public static final String ENTIDAD = "Pokemon";

    public PokemonNotFoundException(){
        super(ENTIDAD);
    }

    public PokemonNotFoundException(int id){
        super(ENTIDAD, id);
    }
}