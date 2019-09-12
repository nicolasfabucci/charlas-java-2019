package com.eiv.testing;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;

public class SumatoriaTest {

    @Test
    public void given1mas2mas3_whenSuma_thenResultado6() {
        
        int resultado = Sumatoria.sumar(1, 2, 3);
        assertThat("1+2+3=6", resultado, Matchers.is(6));
    }
    
    @Test
    public void givenSumatoria_thenInstancia() {
        Sumatoria sumatoria = new Sumatoria();
        assertThat(sumatoria, Matchers.notNullValue());
    }
}
