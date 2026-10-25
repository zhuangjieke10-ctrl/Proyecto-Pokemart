# Modificar Pokémon — PUT

Esta práctica permite recibir el **ID** del Pokémon desde la ruta y los **nuevos datos** desde el cuerpo de la petición.

- Ruta: `PUT /pokemons/{id}`
- Controller: `@PutMapping("/{id}")`, `@PathVariable int id`, `@RequestBody PokemonRequest`
- Flujo: `PokemonController` → `PokemonMapper.toCommand(id, request)` → `EditPokemonService` → `EditPokemonUseCase`.

## Cómo probarlo

Iniciar `StoreApplication.java` y ejecutar en una terminal:

```bash
curl -i -X PUT http://localhost:8080/pokemons/5 \
  -H "Content-Type: application/json" \
  -d '{"nombre":"Pikachu","tipo":"Electrico","foto":"https://ejemplo.com/pikachu.png","precio":35.5}'
```

En **Debug**, colocar un breakpoint en `PokemonController.editPokemon()` o `EditPokemonUseCase.update()` y comprobar que llega `id = 5`, la foto y el precio.

[← Volver al README](../README.md)
