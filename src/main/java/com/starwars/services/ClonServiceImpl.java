
package com.starwars.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.starwars.repository.ClonRepository;
import com.starwars.repository.DivisionRepository;
import com.starwars.repository.PlanetaRepository;

import jakarta.persistence.EntityNotFoundException;

import com.starwars.models.Clon;
import com.starwars.models.Planeta;
import com.starwars.models.Division;

@Service
public class ClonServiceImpl implements ClonService {

    @Autowired
    ClonRepository repository;

    @Autowired
    PlanetaRepository planetaRepository;

    @Autowired
    DivisionRepository divisionRepository;

    @Override
    public List<Clon> clones() {
        return repository.findAll();
    }

    @Override
    public void crearClon(Clon clon) {
        repository.save(clon);
    }

    @Override
    public void updateClon(Clon clon) {
        Planeta planetaExistente = clon.getPlaneta();
        if (planetaExistente == null) {
            throw new IllegalArgumentException("El clon no tiene un planeta asignado");
        }
        Division divisionExistente = clon.getDivision();
        if (divisionExistente == null) {
            throw new IllegalArgumentException("El clon no tiene una división asignada");
        }
        repository.save(clon);
    }

    @Override
    public List<Clon> borrarClon(int codClon) {
        repository.deleteById(codClon);
        return repository.findAll();
    }

    @Override
    public List<Clon> getClonesPlaneta(String planeta) {
        return repository.getClonesByPlaneta(planeta);
    }

    @Override
    public List<Clon> borrarPlanetaFromClon(int codClon) {
        repository.deletePlanetaFromClones(codClon);
    
        return repository.findAll();
    }
}

    
