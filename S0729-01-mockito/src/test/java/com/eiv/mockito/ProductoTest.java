package com.eiv.mockito;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Test;

public class ProductoTest {

    @Test
    public void test() {
        
        ProductoImpl productoImpl = new ProductoImpl();
        int resultado = productoImpl.ejecutar(5, 5);
        
        assertThat(resultado, Is.is(25));
    }
}
