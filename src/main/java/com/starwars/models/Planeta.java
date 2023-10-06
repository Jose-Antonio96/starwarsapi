package com.starwars.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "planetas")
public class Planeta {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codPlaneta;
    private String planeta;

    @OneToMany(mappedBy = "planeta")
    private List<Clon> clones = new ArrayList<>();

    public Planeta() {
        super();
    }

    public Planeta(int codPlaneta, String planeta) {
        super();
        this.codPlaneta = codPlaneta;
        this.planeta = planeta;
    }

    public int getCodPlaneta() {
        return codPlaneta;
    }

    public void setCodPlaneta(int codPlaneta) {
        this.codPlaneta = codPlaneta;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codPlaneta;
        result = prime * result + ((planeta == null) ? 0 : planeta.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Planeta other = (Planeta) obj;
        if (codPlaneta != other.codPlaneta)
            return false;
        if (planeta == null) {
            if (other.planeta != null)
                return false;
        } else if (!planeta.equals(other.planeta))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Planeta [codPlaneta=" + codPlaneta + ", planeta=" + planeta + ", clones=" + clones + "]";
    }


        
    
}


