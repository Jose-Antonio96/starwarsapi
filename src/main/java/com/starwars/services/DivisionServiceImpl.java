package com.starwars.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.starwars.models.Division;
import com.starwars.repository.DivisionRepository;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    DivisionRepository repository;
    
    @Override
    public List<Division> divisiones(){
        return repository.findAll();
    }

    @Override
    public void crearDivision(Division division){
        repository.save(division);
    }

    @Override
    public void cambiarDivision(Division division){
        repository.save(division);
    }

    @Override
    public List<Division> borrarDivision(int codDivision){
        repository.deleteById(codDivision);
        return repository.findAll();
    }
}
