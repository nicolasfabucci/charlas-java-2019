package com.eiv;

import java.util.HashSet;
import java.util.Set;

public class App3 {

    public static void main(String[] args) {
        
        Set<Perro> perros = new HashSet<Perro>();
        
        perros.add(new Perro(1L, "p1"));
        perros.add(new Perro(2L, "p2"));
        perros.add(new Perro(3L, "p3"));
        perros.add(new Perro(4L, "p4"));
        perros.add(new Perro(5L, "p5"));
        
        perros.add(new Perro(5L, "p5"));
        
        for(Perro perro : perros) {
            System.out.println("Perro: " + perro.getDescripcion());
        }
    }
}
