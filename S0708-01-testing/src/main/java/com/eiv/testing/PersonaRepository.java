package com.eiv.testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PersonaRepository {

    private static Map<Long, Persona> personaDatasource;
    
    static {
        personaDatasource = new HashMap<Long, PersonaRepository.Persona>();
        
        personaDatasource.put(1L, new Persona(1L, "Diego"));
        personaDatasource.put(2L, new Persona(2L, "Franco"));
        personaDatasource.put(3L, new Persona(3L, "Pablo"));
        personaDatasource.put(4L, new Persona(4L, "Julio"));
        personaDatasource.put(5L, new Persona(5L, "Nicolas"));
        personaDatasource.put(6L, new Persona(6L, "Natalia"));
        personaDatasource.put(7L, new Persona(7L, "Eduardo"));
        personaDatasource.put(8L, new Persona(8L, "Sergio"));
        personaDatasource.put(9L, new Persona(9L, "Ismael"));
    }
    
    public Optional<Persona> findById(Long id) {
        Persona persona = personaDatasource.get(id);
        if (persona == null) {
            return Optional.empty();
        } else {
            return Optional.of(persona);
        }
    }
    
    public Persona agregar(String nombre) {
        
        Long id = personaDatasource.keySet()
                .stream()
                .mapToLong(x -> x)
                .max()
                .orElse(0L);
        
        Persona persona = new Persona(id + 1, nombre);
        personaDatasource.put(id + 1, persona);
        
        return persona;
    }
    
    public List<Persona> findAll() {
        List<Persona> personas = new ArrayList<PersonaRepository.Persona>();
        personaDatasource.forEach((key, value) -> {
            personas.add(value);
        }); 
        return personas;
    }
    
    public static class Persona {
        
        private Long id;
        private String nombre;
        
        public Persona() {
        }

        public Persona(Long id, String nombre) {
            super();
            this.id = id;
            this.nombre = nombre;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Persona(Long id) {
            super();
            this.id = id;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((id == null) ? 0 : id.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            Persona other = (Persona) obj;
            if (id == null) {
                if (other.id != null) {
                    return false;
                }
            } else if (!id.equals(other.id)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "Persona [id=" + id + ", nombre=" + nombre + "]";
        }
        
    }
}
