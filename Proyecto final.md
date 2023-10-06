# Idea de proyecto

Dos microservicios, starwarsapi y armadaapi

El api Armada consume Star Wars, que hace de api base para esta.
El propósito de Star Wars es de obtener y manejar los datos de las tablas en la DB, permitiendo que los otros dos apis puedan crear soldados clones a través de Star Wars.




# Tablas
  
La BD dispone de las tablas clones, divisiones y planetas.

En la carpeta resources


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