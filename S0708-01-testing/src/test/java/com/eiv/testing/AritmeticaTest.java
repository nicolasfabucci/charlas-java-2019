package com.eiv.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AritmeticaTest {

    // givenAAAA_whenBBBB_thenCCC
    
    @Test
    public void given5mas5_whenSuma_then10() {
        
        // Paso 1 - inicilializacion
        Aritmetica aritmetica = new Aritmetica();
        
        // Paso 2 - ejecucion del test
        int resultado = aritmetica.suma(5, 5);
        
        // Paso 3 - evaluacion
        assertEquals(10, resultado);
        
    }

    @Test
    public void given15mas15_whenSuma_then30() {
        
        // Paso 1 - inicilializacion
        Aritmetica aritmetica = new Aritmetica();
        
        // Paso 2 - ejecucion del test
        int resultado = aritmetica.suma(15, 15);
        
        // Paso 3 - evaluacion
        assertEquals(30, resultado);
        
    }
}
