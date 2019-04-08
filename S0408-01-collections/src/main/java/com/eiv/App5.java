package com.eiv;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class App5 {

    public static void main(String[] args) {

        Map<Integer, Perro> mapa = new HashMap<Integer, Perro>();
        Perro perro1 = new Perro("descripcion-4");
        
        mapa.put(1, new Perro("descripcion-1"));
        mapa.put(2, new Perro("descripcion-2"));
        mapa.put(3, new Perro("descripcion-3"));
        mapa.put(4, perro1);
        
        perro1.setDescripcion("otra desc");
        
        mapa.put(5, perro1);
        
        Perro perro3 = mapa.get(3);
        System.out.println("Perro: " + perro3);
        
        for(Entry<Integer, Perro> entry : mapa.entrySet()) {
            Integer clave = entry.getKey();
            Perro perro = entry.getValue();
            System.out.println("Perro con clave " + clave + " y desc. " + perro.getDescripcion());
        }
        
    }

}
