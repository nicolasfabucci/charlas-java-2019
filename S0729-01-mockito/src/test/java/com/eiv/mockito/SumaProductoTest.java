package com.eiv.mockito;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class SumaProductoTest {

    @InjectMocks private SumaProductoImpl sumaProducto;
    @Mock private ProductoImpl producto;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        
        Mockito.when(producto.ejecutar(Mockito.anyInt(), Mockito.anyInt())).thenReturn(1);
    }
    
    @Test
    public void test() {
        
        int resultado = sumaProducto.ejecutar(2, 3, 4, 5);

        assertThat(resultado, Is.is(2));
    }
}
