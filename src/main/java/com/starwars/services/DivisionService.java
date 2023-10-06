package com.starwars.services;

import java.util.List;

import com.starwars.models.Division;

public interface DivisionService {
    List<Division> divisiones();

    void crearDivision(Division division);

    void cambiarDivision(Division division);

    List<Division> borrarDivision(int codDivision);
}
