# Idea de proyecto

## API REST

Dos microservicios, starwarsapi y armadaapi

El api Armada consume Star Wars, que hace de api base para esta.
El propósito de Star Wars es de obtener y manejar los datos de las tablas en la DB, permitiendo que los otros dos apis puedan crear soldados clones a través de Star Wars.




# Tablas
  
La BD dispone de las tablas clones, divisiones y planetas.

En la carpeta resources



## Requisitos

Java 17
Maven 3.9.4
Spring Boot 3.14

## Dependencias del pom

Spring Boot Web Starter
H2 Database
Spring Boot Test Starter
MySQL Driver

## Funcionalidades

CRUD de clon, divisiones y tablas
Crear soldado
Buscar clones/soldados por planeta
Actualizar la división y planeta de un clon

## Ejemplo de creación de clon/soldado

~~~

{
        "codClon": 0,
        "nombre": "John",
        "division": {
            "codDivision": 511,
            "division": "La 511"
        },
        "planeta": {
            "codPlaneta": 451,
            "planeta": "Dagovah"
        }
    }

~~~

## Estructura

**PUT /clon** - Actualizar el planeta y division del clon.
**PUT /soldado** - Actualizar el planeta y division del soldado.
**GET /clones/{planeta}** - Obtener los clones que pertenecen a ese planeta.
**GET /soldados/{planeta}** - Obtener los soldados que pertenecen a ese planeta.

