# Poke - Mart

Proyecto implementado por:

- Cristian David Anghel
- Jieke Zhuang
- Mauro

## 1.0 Implementación de arquitectura clean: Domain Application Infraestructure

Se ha implementado la siguiente rama:

- /src/main/java/es/etg/daw/dawes/store/pokemon
    - application
        - command
            - CreatePokemonCommand.java
        - service
            - CreatePokemonService.java
        - usecase
            - CreatePokemonUseCase.java
    - domain
        - model
            - Pokemon.java   
    - infraestructure
        - config
            - PokemonConfig.java
        - mapper
            - PokemonMapper.java
        - web
            - mvc
                - controller
                    - PokemonController.java
                - dto
                    - PokemonRequest.java
                    - PokemonResponse.java

### Como ejecutar

Inicia el programa desde la clase *StoreApplication.java*. Debería salir en la terminal líneas como esta:

```bash
2026-10-09T18:35:54.327+02:00  INFO 6809 --- [store] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat initialized with port 8080 (http)
```

Y desde  <http://localhost:8080/formulario-crear-pokemon.html> Deberías ver una imagen como esta:
