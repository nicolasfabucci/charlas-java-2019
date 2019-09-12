package com.eiv.testing;

import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.Optional;

import org.hamcrest.Matchers;
import org.junit.Test;

import com.eiv.testing.PersonaRepository.Persona;

public class PersonaRepositoryTest {

    @Test
    public void givenId_thenPersona() {
        
        // Paso 1
        PersonaRepository personaRepository = new PersonaRepository();
        
        // Paso 2
        Optional<Persona> resultado = personaRepository.findById(1L);
        
        // Paso 3
        Optional<Persona> esperado = Optional.of(new Persona(1L, "Diego"));
        assertThat(resultado, Matchers.is(esperado));
        
    }
    
    @Test
    public void thenPersonas() {

        // Paso 1
        PersonaRepository personaRepository = new PersonaRepository();

        // Paso 2
        List<Persona> personas1 = personaRepository.findAll();
        int sizeOrg = personas1.size();

        personaRepository.agregar("Juan");
        
        List<Persona> personas2 = personaRepository.findAll();
        int size = personas2.size();
        
        // Paso 3
        assertThat("Aumentado en 1", size - sizeOrg, Matchers.is(1));
        
    }
    
    @Test
    public void thenPersonas2() {
        
        PersonaRepository personaRepository = new PersonaRepository();

        personaRepository.agregar("Juan");
        
        List<Persona> personas = personaRepository.findAll();
        Optional<Persona> personaOptional = personas
                .stream()
                .filter(p -> p.getNombre().equals("Juan"))
                .findFirst();
        
        assertThat(personaOptional.isPresent(), Matchers.is(true));
        
    }
}
