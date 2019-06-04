package com.eiv;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class App2 {

    public static void main(String[] args) {
        
        Map<Long, String> perroMap = new HashMap<Long, String>();
        
        perroMap.put(1L, "perro-1");
        perroMap.put(2L, "perro-2");
        perroMap.put(3L, "perro-3");
        perroMap.put(4L, "perro-4");
        perroMap.put(5L, "perro-5");

        // Recorrer ...
        
        for(Entry<Long, String> perroEntry : perroMap.entrySet()) {
            Long id = perroEntry.getKey();
            String descripcion = perroEntry.getValue();
            
            System.out.println("ID: " + id + " - Descripcion: " + descripcion);
        }
        
        // Buscar uno por su clave
        String descripcion = perroMap.get(1L);
        System.out.println("Descripcion: " + descripcion);
        
    }
}
