package com.eiv.herencia;

import java.time.LocalDate;

public class Empleado extends Persona {

    private Long nroLegajo;
    private LocalDate fechaIngreso;
    
    public Empleado() {
        super();
    }

    public Empleado(
            Long id, String nombres, String apellidos, Long nroLegajo, LocalDate fechaIngreso) {
        super(id, nombres, apellidos);
        this.nroLegajo = nroLegajo;
        this.fechaIngreso = fechaIngreso;
    }

    public Long getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(Long nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Empleado [nroLegajo=" + nroLegajo + "]";
    }
}
