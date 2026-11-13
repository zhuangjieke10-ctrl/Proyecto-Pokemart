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

El Controller recibe `PokemonRequest` y el Mapper lo transforma en `CreatePokemonCommand`. Después, `CreatePokemonService` llama a `CreatePokemonUseCase`, que crea el objeto con `Pokemon.builder()` y devuelve el resultado al Controller.

## Gestión de validación

La aplicación esta preparada para mostrar un mensaje de error dependiendo de los siguientes casos:

- El nombre del Pokémon no puede estar **vacío**. Tampoco  puede tener un **salto de línea ni espacio  en blanco**.
- El tipo del Pokémon no puede estar **vacío**.
- El preciod el Pokémon no puede estar ni por debajo de 0 ni por encima de 100.
