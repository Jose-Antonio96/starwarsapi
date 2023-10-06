package com.starwars.services;

import java.util.List;
import com.starwars.models.Planeta;

public interface PlanetaService {
    List<Planeta> planetas();

    void crearPlaneta(Planeta planeta);

    void cambiarPlaneta(Planeta planeta);

    List<Planeta> borrarPlaneta(int codPlaneta);
}
