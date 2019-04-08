package com.eiv.ejemplo2;

public class Perro extends Animal {

    @Override
    public String descripcion() {
        // TODO Auto-generated method stub
        String animal = super.descripcion();
        return animal + " - Clase Perro";
        //return super.descripcion();
    }

    @Override
    public String sonido() {
        // TODO Auto-generated method stub
        return "guau!";
    }
    
    public static String algo() {
        return "ALGO";
    }

}
