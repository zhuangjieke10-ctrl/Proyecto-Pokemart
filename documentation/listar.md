## 3. Implementación de una lista estática de 3 Pokémons

### Cambios en la estructura

```txt
.
│   StoreApplication.java
│   
└───pokemon
    ├───application
    │   ├───command
    │   │       CreatePokemonCommand.java
    │   │       
    │   ├───service
    │   │       CreatePokemonService.java
    │   │       ListPokemonService.java
    │   │       
    │   └───usecase
    │           CreatePokemonUseCase.java
    │           FindPokemonUseCase.java
    │           
    ├───domain
    │   └───model
    │           Pokemon.java
    │           
    └───infraestructure
        ├───config
        │       PokemonConfig.java
        │       
        ├───mapper
        │       PokemonMapper.java
        │       
        └───web
            └───mvc
                ├───controller
                │       PokemonController.java
                │       
                └───dto
                        PokemonRequest.java
                        PokemonResponse.java
```

### Archivos nuevos

#### Application

- ListPokemonService.java
- FindPokemonUseCase.java

### Otros cambios

Se ha creado un nuevo método en PokemonController.java para responder a la petición de listar con */listar*.
En PokemonConfig.java se han añadido los beans de ListPokemonService.java y FindPokemonUseCase.java para que Spring instancie ambas clases.

### ¿Cómo probarlo?

Arranca la aplicación, y en tu navegador introduce

<http://localhost:8080/pokemons/lista>

Si todo va bien,  deberías de ver el siguiente contenido:

<img src= "./images/listaPokemons.png">

[← Volver al índice](./README.md)


