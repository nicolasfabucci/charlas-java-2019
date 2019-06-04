package com.eiv;

import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        
        List<Persona> personas = Persona.personas();
        personas.forEach(persona -> System.out.println(persona));
        
        List<String> apellidos = personas.stream()
                .map(persona -> persona.getApellido())
                .sorted((a1, a2) -> a1.compareTo(a2))
                .collect(Collectors.toList());
        
        apellidos.forEach(apellido -> System.out.println(apellido));
        
        // todos
        boolean bool = apellidos.stream().allMatch(p -> p.contains("RASPO"));
        System.out.println(bool);
        
        // al menos uno
        boolean bool2 = apellidos.stream().anyMatch(p -> p.contains("RASPO"));
        System.out.println(bool2);
        
        // ninguno
        boolean bool3 = apellidos.stream().noneMatch(p -> p.contains("IZQUIERDO"));
        System.out.println(bool3);
        
        Integer suma = personas.stream()
                .map(p -> p.getEdad())
                .reduce(0, (a, b) -> a+b);
        
        System.out.println("Suma edad: " + suma);
        
    }
}
