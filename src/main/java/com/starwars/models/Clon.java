package com.starwars.models;

import jakarta.persistence.*;



@Entity
@Table(name = "clones")
public class Clon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codClon;
    private String nombre;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cod_division", referencedColumnName = "codDivision") 
    private Division division;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cod_planeta", referencedColumnName = "codPlaneta") 
    private Planeta planeta;

    public Clon() {
        super();
    }

    public Clon(int codClon, String nombre, Division division, Planeta planeta) {
        super();
        this.codClon = codClon;
        this.nombre = nombre;
        this.division = division;
        this.planeta = planeta;
    }

    public int getCodClon() {
        return codClon;
    }

    public void setCodClon(int codClon) {
        this.codClon = codClon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codClon;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((division == null) ? 0 : division.hashCode());
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
        Clon other = (Clon) obj;
        if (codClon != other.codClon)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (division == null) {
            if (other.division != null)
                return false;
        } else if (!division.equals(other.division))
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
        return "Clon [codClon=" + codClon + ", nombre=" + nombre + ", division=" + division + ", planeta=" + planeta
                + "]";
    }  

    
    

    


}
