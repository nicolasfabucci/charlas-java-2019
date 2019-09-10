package com.eiv;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app.potencia")
public class Param {

    private double exponente;
    private double bias;
    
    public Param() {
    }

    public double getExponente() {
        return exponente;
    }

    public void setExponente(double exponente) {
        this.exponente = exponente;
    }

    public double getBias() {
        return bias;
    }

    public void setBias(double bias) {
        this.bias = bias;
    }
    
}
