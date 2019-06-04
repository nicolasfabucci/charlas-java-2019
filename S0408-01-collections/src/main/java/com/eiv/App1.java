package com.eiv;

import java.util.ArrayList;
import java.util.List;

public class App1 {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        
        List perros = new ArrayList();
        
        Perro perro1 = new Perro(1L, "perro-1");
        Perro perro2 = new Perro(2L, "perro-2");
        
        perros.add(perro1);
        perros.add(perro2);
        
        for(Object item : perros) {
            Perro perro = (Perro) item;
            System.out.println(perro.getDescripcion());
        }
        
        System.out.println("Listo!");
    }
}
