# Crear Pokémon — POST

La aplicación permite introducir un Pokémon mediante un formulario HTML. El navegador envía sus datos a `POST /pokemons`.

## Cómo probarlo

1. Iniciar `StoreApplication.java` (la aplicación escucha en el puerto `8080`).
2. Abrir <http://localhost:8080/formulario-crear-pokemon.html>.
3. Rellenar los campos y pulsar **Crear Pokemon**.
4. El navegador recibe una página HTML con los datos del Pokémon creado.

![Formulario de creación](images/formulario.png)

![Resultado tras crear un Pokémon](images/formularioCompleto.png)

## Cómo funciona

El Controller valida `PokemonRequest` con `@Valid` y el Mapper lo transforma en `CreatePokemonCommand`. Después, `CreatePokemonService` llama a `CreatePokemonUseCase`, que crea el objeto con `Pokemon.builder()` y lo guarda mediante `PokemonRepository.save()`.
