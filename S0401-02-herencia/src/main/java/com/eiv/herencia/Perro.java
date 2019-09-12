package com.eiv.herencia;

public class Perro extends Animal {

    private Caracteristicas caracteristicas;
    private Dueno dueno;
    
    public Perro() {
        this.caracteristicas = new Caracteristicas();
        this.dueno = new Dueno();
    }
    
    public Caracteristicas getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(Caracteristicas caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    @Override
    public String descripcion() {
        // llamo al mismo metodo pero en la clase padre
        String animal = super.descripcion();
        return animal + " es la clase padre de 'Perro'";
    }
    
    @Override
    public String sonido() {
        // Implemento el metodo abstracto de la clase 'Animal'
        return "guau guau";
    }

    public class Caracteristicas {
        
        private int peso;
        private int altura;
        
        public int getPeso() {
            return peso;
        }
        
        public void setPeso(int peso) {
            this.peso = peso;
        }
        
        public int getAltura() {
            return altura;
        }
        
        public void setAltura(int altura) {
            this.altura = altura;
        }
    }
    
    public static class Dueno {
        
        private String nombre;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
}
