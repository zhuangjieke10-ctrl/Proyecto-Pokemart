# Tienda Pokémon - Pokemart

## 1. Arquitectura del Proyecto (¿Qué estructura utilizamos y por qué?)

Para este proyecto hemos decidido implementar una *Arquitectura en Capas inspirada en Clean Architecture*, organizada por funcionalidades mediante *Vertical Slicing*.

### ¿Por qué utilizamos esta estructura?

* **Separación de responsabilidades:** Cada parte de la aplicación tiene una función. Si cambia la base de datos o cambia la interfaz web, el núcleo del negocio no sufre modificaciones.
* **Mantenibilidad y Escalabilidad:** Si mañana queremos cambiar la página HTML por una API REST o conectar una base de datos real, el núcleo de nuestro negocio (el Pokémon) no sufrirá modificaciones.
* **Desacoplamiento:** La capa Domain no depende de frameworks externos como Spring Boot ni de las librerías propias de la infraestructura.

## 2. Organización de Capas (¿Cómo se divide y cómo se usa?)

La aplicación se divide de forma jerárquica desde el núcleo hasta el exterior:

### A. Capa de Dominio (domain)

* **Qué es:** Es el corazón de nuestra aplicación. Contiene las entidades puras del negocio (la clase Pokemon).
* **Por qué:** No sabe nada de bases de datos, ni de páginas web, ni de Spring. Solo define las reglas y datos básicos de un Pokémon.

### B. Capa de Aplicación (application)

* **Qué es:** Contiene la lógica de los casos de uso de la aplicación, los servicios y los comandos (CreatePokemonUseCase, CreatePokemonService, CreatePokemonCommand).
* **Cómo se usa:** Utiliza el *Patrón Command* para encapsular los datos que entran y orquesta las operaciones que puede hacer el usuario (como crear o listar Pokémon).

### C. Capa de Infraestructura (infraestructure)

* **Qué es:** Es la capa que conecta nuestra aplicación con el mundo exterior.
* **Cómo se usa:** Recibe las peticiones HTTP del cliente a través del controlador (PokemonController), transforma los datos usando el Mapper y delega en los servicios de aplicación.

[← Volver al índice](../README.md)
