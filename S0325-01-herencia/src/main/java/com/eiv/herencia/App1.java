package com.eiv.herencia;

import java.time.LocalDate;

public class App1 {

    public static void main(String[] args) {

        Empleado empleado = new Empleado(1L, "JUAN", "PEREZ", 1l, LocalDate.now());
        System.out.println("Empleado: " + empleado.toString());
        
        // Downcast
        Persona persona = (Persona) empleado;
        System.out.println("Persona: " + persona.toString());
        
    }
}
