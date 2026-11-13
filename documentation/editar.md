# Modificar Pokémon — PUT

Esta práctica permite recibir el **ID** del Pokémon desde la ruta y los **nuevos datos** desde el cuerpo de la petición.

- Ruta: `PUT /pokemons/{id}`
- Controller: `@PutMapping("/{id}")`, `@PathVariable int id`, `@Valid @RequestBody PokemonRequest`
- Flujo: `PokemonController` → `PokemonMapper.toCommand(id, request)` → `EditPokemonService` → `EditPokemonUseCase` → `PokemonRepository.getById()` y `save()`. Si no existe el ID, se lanza `PokemonNotFoundException`.

## Cómo probarlo

Iniciar `StoreApplication.java` y ejecutar en una terminal:

```bash
curl -i -X PUT http://localhost:8080/pokemons/1 \
  -H "Content-Type: application/json" \
  -d '{"nombre":"cambiado","tipo":"Electrico","foto":"https://ejemplo.com/pikachu.png","precio":35.5}'
```

Debería de verse los resultados en <http://localhost:8080/pokemons>.

<img src="./images/modificacionPokemon.png">


