## 1. Implementación de arquitectura clean: Domain Application Infraestructure

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

[← Volver al índice](./README.md)