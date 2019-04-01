package com.eiv.herencia.animales;

public abstract class Animal {

    public String descripcion() {
        return "animal";
    }

    public abstract String sonido();

    public static String MetodoSinInstanciar() {
            return "No se instanció y todo ok";
    } 
}