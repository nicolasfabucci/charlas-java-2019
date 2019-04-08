package com.eiv;

import java.util.HashMap;
import java.util.Map;

public class App3 {

    public static void main(String[] args) {
        
        Map<Integer, Perro> mapa = new HashMap<>();
        
        mapa.put(1, new Perro("perro-1"));
        mapa.put(2, new Perro("perro-2"));
        mapa.put(3, new Perro("perro-3"));
        mapa.put(4, new Perro("perro-4"));
        mapa.put(5, new Perro("perro-5"));
        mapa.put(6, new Perro("perro-6"));
        
        Perro perro4 = mapa.get(4);
        System.out.println("perro: " + perro4.getDescripcion());
        
    }
    
}
