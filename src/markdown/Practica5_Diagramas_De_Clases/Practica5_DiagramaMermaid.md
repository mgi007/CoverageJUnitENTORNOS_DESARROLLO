[Enlace al diagrama pintado por mermaid](imagen.png)

``` mermaid
classDiagram

    Figura --|> Rectangulo
    Figura --|> Triangulo
    
    class Figura {
        -base : Double
        -altura : Double
        +getAltura() Double
        +setAltura() void
        +getBase() Double
        +setBase() void
    }

    class Rectangulo {
       +calcularArea() Double 
    }

    class Triangulo {
        +calcularArea() Double
    }

```