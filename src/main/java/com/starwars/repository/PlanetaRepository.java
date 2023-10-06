package com.starwars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.starwars.models.Planeta;

@Repository
public interface PlanetaRepository extends JpaRepository<Planeta, Integer>{
   
}