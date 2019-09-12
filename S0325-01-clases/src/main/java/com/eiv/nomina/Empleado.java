package com.eiv.nomina;

public class Empleado extends Persona {

    private int legajo;
    
    public Empleado() {
        super();
    }
    
    public Empleado(int legajo, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String denominacion() {
        return apellido + ", " + nombre;
    }
}
