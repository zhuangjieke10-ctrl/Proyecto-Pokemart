# Eliminar Pokémon — DELETE

La petición identifica el Pokémon que queremos eliminar mediante un parámetro de ruta: `DELETE /pokemons/{id}`.

- Controller: `@DeleteMapping("/{id}")` y `@PathVariable int id`.
- Flujo: `PokemonController` → `DeletePokemonService` → `DeletePokemonUseCase` → `PokemonRepository.getById()` y `deleteById()`. Si no existe el ID, se lanza `PokemonNotFoundException`.
- Respuesta actual: `204 No Content`.

## Cómo probarlo con curl

Iniciar `StoreApplication.java` y ejecutar:

```bash
curl -i -X DELETE http://localhost:8080/pokemons/5
```

## Alternativa: formulario HTML

Iniciar `StoreApplication.java` e introducir la siguiente dirección en tu navegador:

<http://localhost:8080/formulario-eliminar-pokemon.html>

Deberías ver el siguiente formulario:

<img src="./images/formularioeliminar.png">

Si hemos eliminado el id de un Pokémon **existente** y vamos a <http://localhost:8080/pokemons>, deberíamos de ver que el Pokémon que ha tenido ese ID ha sido eliminado.
