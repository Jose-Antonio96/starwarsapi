package com.starwars.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "divisiones")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codDivision;
    private String division;

    @OneToMany(mappedBy = "division")
    private List<Clon> clones = new ArrayList<>();
    
    public Division() {
        super();
    }
    
    public Division(int codDivision, String division) {
        super();
        this.codDivision = codDivision;
        this.division = division;
    }

    public int getCodDivision() {
        return codDivision;
    }

    public void setCodDivision(int codDivision) {
        this.codDivision = codDivision;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codDivision;
        result = prime * result + ((division == null) ? 0 : division.hashCode());
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
        Division other = (Division) obj;
        if (codDivision != other.codDivision)
            return false;
        if (division == null) {
            if (other.division != null)
                return false;
        } else if (!division.equals(other.division))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Division [codDivision=" + codDivision + ", division=" + division + ", clones=" + clones + "]";
    }
}
