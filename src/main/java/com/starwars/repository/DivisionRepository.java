package com.starwars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.starwars.models.Division;

@Repository
public interface DivisionRepository extends JpaRepository<Division, Integer>{
    
}