package com.eiv.testing;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;

public class EmpresaTest {

    @Test
    public void givenEmpresa_whenNombre_thenNombreEmpresaNoVacio() {
        
        // NULL
        // "    "
        // " EIV "
        // ""

        String resultado = "";
        
        assertThat(resultado, Matchers.allOf(
                Matchers.not(Matchers.isEmptyOrNullString()),
                Matchers.is(resultado.trim())));
        
    }
}
