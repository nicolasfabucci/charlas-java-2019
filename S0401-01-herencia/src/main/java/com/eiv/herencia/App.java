package com.eiv.herencia;

import com.eiv.herencia.animales.Animal;
import com.eiv.herencia.animales.Gato;
import com.eiv.herencia.animales.Perro;

public class App {

    public static void main(String[] args) {

        Perro perro = new Perro();
        System.out.println("Hola soy: " + perro.descripcion() + " digo " + perro.sonido());
        
        perro.getPulga().setNombre("Pulgis");
        
        System.out.println("Hola soy: " + perro.descripcion() + " digo " + perro.sonido() + 
               " y tengo una pulga llamada " + perro.getPulga().getNombre() );

        Gato gato = new Gato();
        System.out.println("Hola soy: " + gato.descripcion() + " digo " + gato.sonido());

        // no se puede instanciar sino los defino los metodos abstractos
        Animal humano = new Animal() {
            @Override
            public String sonido() {
                return "qué hacés mono??";
            }
        };

        System.out.println("Hola soy: " + humano.descripcion() + " digo " + humano.sonido());

        System.out.println("Sin instanciar: " + Animal.MetodoSinInstanciar());
        
        

    }

}
