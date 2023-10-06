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

import com.starwars.models.Division;
import com.starwars.services.DivisionService;


@RestController
public class DivisionController {
    @Autowired 
    DivisionService service;

    @GetMapping(value = "divisiones", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Division> divisiones(){
        return service.divisiones();
    }

    @PostMapping(value = "division", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void crear(@RequestBody Division division){
        service.crearDivision(division);
    }

    @PutMapping(value = "division", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void cambiar(@RequestBody Division division){
        service.cambiarDivision(division);
    }

    @DeleteMapping(value = "division/{codDivision}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Division> borrar(@PathVariable int codDivision){
        return service.borrarDivision(codDivision);
    }
}
