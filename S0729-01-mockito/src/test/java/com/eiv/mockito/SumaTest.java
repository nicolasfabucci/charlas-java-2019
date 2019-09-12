package com.eiv.mockito;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Test;

public class SumaTest {

    @Test
    public void test() {
        
        SumaImpl sumaImpl = new SumaImpl();
        int resultado = sumaImpl.ejecutar(5, 5);
        
        assertThat(resultado, Is.is(10));
    }
}
