package com.starwars.services;

import java.util.List;

import com.starwars.models.Clon;

public interface ClonService {
    List<Clon> clones();

    void crearClon(Clon clon);

    void updateClon(Clon clon);

    List<Clon> borrarClon(int codClon);

    List<Clon> getClonesPlaneta(String planeta);

    List<Clon> borrarPlanetaFromClon(int codClon);

}
