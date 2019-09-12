package com.eiv.testing;

public class Sumatoria {
    
    public static int sumar(int... numeros) {
        int resultado = 0;
        for(int i = 0; i < numeros.length; i++) {
            resultado += numeros[i];
        }
        return resultado;
    }
    
}
