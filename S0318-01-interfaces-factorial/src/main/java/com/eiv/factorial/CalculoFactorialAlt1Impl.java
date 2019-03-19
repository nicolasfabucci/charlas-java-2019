package com.eiv.factorial;

public class CalculoFactorialAlt1Impl implements CalculoFactorial {

    @Override
    public long calcular(int numero) {
        long resultado = 1;
        for(int i = 0; i < numero; i++) {
            resultado = resultado * (i+1);
        }
        return resultado;
    }

    public String detalle() {
        return "Yo calculo el factorial por la alt. 1";
    }
}
