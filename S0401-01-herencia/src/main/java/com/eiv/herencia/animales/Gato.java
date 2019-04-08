package com.eiv.herencia.animales;

public class Gato extends Animal {

    @Override
    public String descripcion() {
        String animal = super.descripcion();
        return animal +  "->gato";
     }

    @Override
    public String sonido() {
        return "miauu miauuuu!!!";
    }
   

}
