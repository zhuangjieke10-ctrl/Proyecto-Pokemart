# Poke - Mart

Proyecto implementado por:

- Cristian David Anghel
- Jieke Zhuang
- Mauro

## 1.0 Implementación de arquitectura clean: Domain Application Infraestructure

Se ha implementado la siguiente rama:

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
    │   │       
    │   │       
    │   └───usecase
    │           CreatePokemonUseCase.java
    │           
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

### Como ejecutar

Inicia el programa desde la clase *StoreApplication.java*. Debería salir en la terminal líneas como esta:

```bash
2026-10-09T18:35:54.327+02:00  INFO 6809 --- [store] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat initialized with port 8080 (http)
```

Y desde  <http://localhost:8080/formulario-crear-pokemon.html> Deberías ver una imagen como esta:

<img src = "./images/formulario.png">

Si rellenamos el formulario deberíamos ver la siguiente página:

<img src = "./images/formularioCompleto.png">

## 1.5 Implementación de una lista estática de 3 Pokémons

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
