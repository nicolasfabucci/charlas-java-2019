package com.eiv.herencia.animales;

public class Perro extends Animal {

    private Pulga pulga;
    
    @Override
    public String descripcion() {
        String animal = super.descripcion();
        return animal +  "->perro";
     }

    @Override
    public String sonido() {
        return "guauu guauuu!!!";
    }
   
    
    public Perro() {
        this.pulga =  new Pulga(); 
    }
    
    public Pulga getPulga() {
        return pulga;
    }

    public void setPulga(Pulga pulga) {
        this.pulga = pulga;
    }

    public class Pulga {
     
        private String nombre;
        
        public Pulga() {}

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        };
        
    }
}
