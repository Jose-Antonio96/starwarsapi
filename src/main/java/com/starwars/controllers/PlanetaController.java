package com.starwars.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.starwars.models.Planeta;
import com.starwars.services.PlanetaService;

@RestController
public class PlanetaController {
    @Autowired 
    PlanetaService service;

    @GetMapping(value = "planetas", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Planeta> planetas(){
        return service.planetas();
    }

    @PostMapping(value = "planeta", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void crear(@RequestBody Planeta planeta){
        service.crearPlaneta(planeta);
    }

    @PutMapping(value = "planeta", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void cambiar(@RequestBody Planeta planeta){
        service.cambiarPlaneta(planeta);
    }

    @DeleteMapping(value = "planeta/{codPlaneta}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Planeta> borrar(@PathVariable int codPlaneta){
        return service.borrarPlaneta(codPlaneta);
    }
}   
