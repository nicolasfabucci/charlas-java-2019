package com.eiv;

import java.util.HashSet;
import java.util.Set;

public class App2 {

    public static void main(String[] args) {
        
        Set<String> nombres = new HashSet<String>();
        
        nombres.add("nombre-1");
        nombres.add("nombre-2");
//        nombres.add("nombre-2");
        
        for(String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }
    }

}
