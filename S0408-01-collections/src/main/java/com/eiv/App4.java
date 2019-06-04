package com.eiv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App4 {

    public static void main(String[] args) {

        List<Perro> perros = new ArrayList<Perro>();
        
        Perro perro1 = new Perro("perro-1");
        
        perros.add(perro1);
        perros.add(new Perro("perro-6"));
        perros.add(new Perro("perro-2"));
        perros.add(new Perro("perro-4"));
        perros.add(new Perro("perro-5"));
        perros.add(new Perro("perro-3"));
        
        for(Perro perro : perros) {
            System.out.println("Perro: " + perro.getDescripcion());
        }
        
        System.out.println("Lista vacia: " + perros.isEmpty());
        System.out.println("Cantidad elems: " + perros.size());
        
        System.out.println("Contiene: " + perros.contains(perro1));
        
        // Ver porque no!
//        Perro[] p = (Perro[]) perros.toArray();
//        System.out.println(p.length);
         perros.sort(new Comparator<Perro>() {
            @Override
            public int compare(Perro o1, Perro o2) {
                return o1.getDescripcion().compareTo(o2.getDescripcion());
            }
        });
         
         Collections.sort(perros, new Comparator<Perro>() {
            @Override
            public int compare(Perro o1, Perro o2) {
                return o1.getDescripcion().compareTo(o2.getDescripcion());
            }
             
        });
         
        for(Perro perro : perros) {
             System.out.println("Perro: " + perro.getDescripcion());
        }
         

        Set<Perro> perrosSet = new HashSet<>();
        
        perrosSet.add(perro1);
        perrosSet.add(new Perro("perro-6"));
        perrosSet.add(new Perro("perro-2"));
        perrosSet.add(new Perro("perro-4"));
        perrosSet.add(new Perro("perro-5"));
        perrosSet.add(new Perro("perro-3"));

        for(Perro perro : perrosSet) {
             System.out.println("Perro: " + perro.getDescripcion());
        }
         
        
    }

}
