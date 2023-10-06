package com.starwars.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.starwars.models.Planeta;
import com.starwars.repository.PlanetaRepository;

@Service
public class PlanetaServiceImpl implements PlanetaService {
    @Autowired
    PlanetaRepository repository;
    
    @Override
    public List<Planeta> planetas(){
        return repository.findAll();
    }

    @Override
    public void crearPlaneta(Planeta planeta){
        repository.save(planeta);
    }

    @Override
    public void cambiarPlaneta(Planeta planeta){
        repository.save(planeta);
    }

    @Override
    public List<Planeta> borrarPlaneta(int codPlaneta){
        repository.deleteById(codPlaneta);
        return repository.findAll();
    }
}
