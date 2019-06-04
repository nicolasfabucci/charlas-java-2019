package com.eiv;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class App2 {

    public static void main(String[] args) {
        
        Set<String> nombres = new HashSet<String>();
        
        nombres.add("nombre-1");
        nombres.add("nombre-2");
//        nombres.add("nombre-2");
        
        for(String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }
        
        // Buscar uno por su clave
        String descripcion = perroMap.get(1L);
        System.out.println("Descripcion: " + descripcion);
        
    }

}
