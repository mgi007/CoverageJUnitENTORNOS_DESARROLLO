
[Enlace al diagrama pintado por mermaid](imagen33.png)

``` mermaid
classDiagram

    Avion "1..1" -- "0..*" Vuelo

    Vuelo "0..*" -- "0..*" Pasajero

    Vuelo .. Billete
    Billete .. Pasajero
    
    class Avion {
        +modelo : String
        +capacidad : Integer
    }

    class Vuelo {
        +plazas : Integer
        +fecha : Date
    }

    class Billete {
        +asiento : Integer
    }

    class Pasajero {
        +nombre : String
        +apellidos: String
        +fechaNacimiento: Date
        +sexo : Genero
    }

class Genero {
        << enumeration >>
        hombre
        mujer
    }


```