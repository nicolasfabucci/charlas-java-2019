package com.eiv.testing;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AritmeticaTest2 {

    @Parameter(0) public int sumando1;
    @Parameter(1) public int sumando2;
    @Parameter(2) public int esperadoSuma;
    @Parameter(3) public int esperadoResta;

    @Parameters(name = "{index}: Sumando 1: {0} - Sumando 2: {1} - Valor esperado: {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { 
            { 5, 5, 10, 0 },
            { 15, 15, 30, 0 }
        });
    }
    
    @Test
    public void givenDosEnteros_whenSuma_thenSumaDeAmbosEnteros() {
        
        // Paso 1 - inicilializacion
        Aritmetica aritmetica = new Aritmetica();
        
        // Paso 2 - ejecucion del test
        int resultado = aritmetica.suma(sumando1, sumando2);
        
        // Paso 3 - evaluacion
        assertEquals(esperadoSuma, resultado);
        
    }

    @Test
    public void givenDosEnteros_whenResta_thenRestaDeAmbosEnteros() {
        
        // Paso 1 - inicilializacion
        Aritmetica aritmetica = new Aritmetica();
        
        // Paso 2 - ejecucion del test
        int resultado = aritmetica.resta(sumando1, sumando2);
        
        // Paso 3 - evaluacion
        assertEquals(esperadoResta, resultado);
        
    }
}
