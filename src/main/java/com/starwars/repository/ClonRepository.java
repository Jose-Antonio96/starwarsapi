package com.starwars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.starwars.models.Clon;
import com.starwars.models.Planeta;

import java.util.List;

@Repository
public interface ClonRepository extends JpaRepository<Clon, Integer> {
    @Query("SELECT c FROM Clon c WHERE c.planeta.planeta = :nombrePlaneta")
    List<Clon> getClonesByPlaneta(@Param("nombrePlaneta") String nombrePlaneta);

    @Query("UPDATE Clon c SET c.planeta = null WHERE c.codClon = :codClon")
    void deletePlanetaFromClones(@Param("codClon") int codClon);

}