package com.starwars.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import com.starwars.models.Clon;
import com.starwars.models.Planeta;
import com.starwars.services.ClonService;

import jakarta.persistence.EntityNotFoundException;

@RestController
public class ClonController {
    @Autowired
    ClonService service;

    @GetMapping(value = "clones", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Clon> clones() {
        return service.clones();
    }

    @PostMapping(value = "clon", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void crear(@RequestBody Clon clon) {
        service.crearClon(clon);
    }

    @PutMapping(value = "clon", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void cambiar(@RequestBody Clon clon) {

        service.updateClon(clon);
    }

    @DeleteMapping(value = "clon/{codClon}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Clon> borrar(@PathVariable int codClon) {
        return service.borrarClon(codClon);
    }

    @GetMapping(value = "clones/{planeta}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Clon> getClonesFromPlaneta(@PathVariable("planeta") String planeta) {
        return service.getClonesPlaneta(planeta);
    }

    @DeleteMapping(value = "/clon/eliminarPlaneta/{codClon}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Clon> quitarPlanetaFromClon(@PathVariable int codClon) {
        return service.borrarPlanetaFromClon(codClon);
    }
}
