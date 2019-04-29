package com.eiv;

import java.util.ArrayList;
import java.util.List;

public class App1 {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
 
        nombres.add("eiv software");
        nombres.add("diego");
        nombres.add("6666");
        
        for(String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

        Perro perro1 = new Perro("descripcion-1");
        Perro perro2 = new Perro("descripcion-2");
        
        List<Perro> perros = new ArrayList<>();
        perros.add(new Perro("descripcion-3"));
        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro2);
        
        
        for(Perro perro : perros) {
            System.out.println("Nombre: " + perro);
        }
    }
}
