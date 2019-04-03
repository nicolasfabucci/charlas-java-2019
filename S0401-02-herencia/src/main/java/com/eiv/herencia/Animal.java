package com.eiv.herencia;

public abstract class Animal {

    public String descripcion() {
        return "Clase 'Animal'";
    }
    
    // Este metodo requiere de una implementacion particular para cada clase
    // que extienda de 'Animal'
    public abstract String sonido();
}
