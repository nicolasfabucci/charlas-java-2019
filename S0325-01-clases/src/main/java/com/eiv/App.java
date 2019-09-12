package com.eiv;

import com.eiv.nomina.Empleado;
import com.eiv.nomina.Persona;

public class App {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado(2, "Diego", "Cairone", 30);
        Empleado empleado3 = new Empleado(3, "Diego", "Cairone", 30);
        
        System.out.println(empleado1.denominacion() + " - edad: " + empleado1.getEdad());
        System.out.println(empleado2.denominacion() + " - edad: " + empleado2.getEdad());
        System.out.println(empleado3.denominacion() + " - edad: " + empleado3.getEdad());
        
        empleado1.setEdad(40);
        System.out.println(empleado1.denominacion() + " - edad: " + empleado1.getEdad());
        
        System.out.println("Nacimiento: " + empleado1.anioNacionamiento());
        
        // downcast
        Persona persona = (Persona) empleado1;
        System.out.println("Nacimiento persona: " + persona.anioNacionamiento());
        
        // upcast - No funciona!!
        Persona persona2 = new Persona("juan", "perez", 50);
        Empleado empleado = (Empleado) persona2;
        
        System.out.println("Nacimiento persona: " + empleado.anioNacionamiento());
        
    }

}
