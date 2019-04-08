package com.eiv.herencia;

import com.eiv.ejemplo2.Animal;
import com.eiv.ejemplo2.Perro;

public class App {

    public static void main(String[] args) {
        
        Perro perro = new Perro();
        System.out.println(perro.descripcion());
        System.out.println(perro.sonido());
        
        Animal humano = new Animal() {
            
            @Override
            public String sonido() {
                // TODO Auto-generated method stub
                return "bla bla";
            }
        };
        System.out.println(humano.sonido());
        
        System.out.println(Perro.algo());
    }
}
