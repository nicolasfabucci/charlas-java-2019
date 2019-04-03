package com.eiv.herencia;

import java.time.LocalDate;

import com.eiv.herencia.utils.FechaUtils;

public class App {

    public static void main(String[] args) {
        
        // Se crea un objeto de la clase Perro y se asigna a la variable 'perro'
        Perro perro = new Perro();
        
        // Desde la variable 'perro' tengo acceso a los metodo heredados desde la clase 'Animal'
        
        System.out.println(perro.descripcion());
        System.out.println(perro.sonido());
        
        
        // Tambien es posible acceder a los metodos del objeto perro sin declarar una
        // variable pero lo puedo hacer solo una vez ya que despues no tengo una
        // referencia al objeto
//        System.out.println(new Perro().descripcion());
                
        
        // Creo un nuevo objeto de la clase animal implementado sus metodos abstractos
        Animal humano = new Animal() {
            
            @Override
            public String sonido() {
                return "bla bla ...";
            }
        };
        
        System.out.println(humano.sonido());
        
        // no se puede porque hay metodos abstractos en animal:
//        Animal humano = new Animal();
        
        // Caso de uso de una metodo estatico
        
        long dias = FechaUtils.diasEntreFecha(
                LocalDate.of(2019, 03, 1), 
                LocalDate.of(2019, 03, 31));
        
        System.out.println("Dias entre fecha: " + dias);
        
        Perro perro2 = new Perro();
        
        perro2.getCaracteristicas().setAltura(50);
        perro2.getCaracteristicas().setPeso(15);
        
        perro2.getDueno().setNombre("EIV SOFTWARE");
                
        System.out.println("Altura (cm): " + perro2.getCaracteristicas().getAltura() + 
            " - Peso (kgr): " + perro2.getCaracteristicas().getPeso());
        
        System.out.println("Pertenece a: " + perro2.getDueno().getNombre());
        
        // Porque 'Dueno' es una clase << ESTATICA >> puedo hacer esto:
        Perro.Dueno nuevoDueno = new Perro.Dueno();
        nuevoDueno.setNombre("GOOGLE");
        
        // No es posible porque la clase interna (inner class) no es estatica
//        Perro.Caracteristicas c = new Perro.Caracteristicas();
                
        perro2.setDueno(nuevoDueno);
        
        System.out.println("Ahora pertenece a: " + perro2.getDueno().getNombre());
        
    }
}
