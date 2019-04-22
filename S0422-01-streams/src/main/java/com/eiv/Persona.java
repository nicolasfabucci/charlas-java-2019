package com.eiv;

import java.util.Arrays;
import java.util.List;

public class Persona {

    private Long id;
    private String nombre;
    private String apellido;
    private Integer edad;
    
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, Integer edad) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
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
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
    }
    
    public static List<Persona> personas() {
        return Arrays.asList(
            new Persona(1L, "DIEGO", "CAIRONE", 29),
            new Persona(2L, "FRANCO", "RASPO", 29),
            new Persona(3L, "PABLO", "RASPO", 29),
            new Persona(4L, "ANALIA", "RASPO", 29),
            new Persona(5L, "PAULA", "HERRERA", 29),
            new Persona(6L, "JULIO", "MARTINEZ", 29),
            new Persona(7L, "NICOLAS", "FABUCCI", 29),
            new Persona(8L, "NATALIA", "LOPEZ", 29),
            new Persona(9L, "EDUARDO", "NAZOR", 29),
            new Persona(10L, "SERGIO", "FRESCHI", 29),
            new Persona(11L, "MATIAS", "MAINI", 29),
            new Persona(12L, "ISMAEL", "AIT", 29)
        );
    }
}
