# Gestionar errores con slice common

Se ha implementado un nuevo slice (common) para manejar las excepciónes de otros slices(como Pokemón), como puede ser **NullPointerException.java**(evitando implementar la gestión de excepciónes en el slice Pokémon, ya que haría el resto de slices dependiente de este).

```mermaid
flowchart LR
    P[Slice Pokemon<br/>Manejar datos de los Pokémon] --> E
    E[Slice Common <br/>Gestiónar excepciónes de otros slices]
    T[Slice Entrenador<br/>Slice inventado] --> E
```