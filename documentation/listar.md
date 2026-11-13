# Listar Pokémon — GET

El listado de prueba muestra tres Pokémon estáticos: Bulbsaur, Charmander y Squirtle.

## Cómo probarlo

1. Iniciar `StoreApplication.java`.
2. Abrir <http://localhost:8080/pokemons>.
3. El Controller devuelve una página HTML con los tres Pokémon.

<img src="./images/listaPokemons.png">

## Cómo funciona

`PokemonController` atiende `GET /pokemons` y llama a `ListPokemonService`, que delega en `FindPokemonUseCase`. El UseCase consulta `PokemonRepository` y devuelve la lista almacenada en `PokemonRepositoryMockImpl`. Finalmente, el Controller genera el HTML con `StringBuilder` y un `for-each`.
