package com.eiv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PotenciaImpl implements Potencia {

    @Value("${app.exponente:3}")
    private double exponente;

    @Override
    public double calcular(double base) {
        return Math.pow(base, exponente);
    }
    
}
