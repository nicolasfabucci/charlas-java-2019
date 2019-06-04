package com.eiv;

public class Suma {

    private int a;
    private int b;
    
    public Suma(int a, int b) {
        if(a >= b) {
            throw new SumaException(
                    SumaException.A_MAYOR_B, "B debe ser mayor que A");
        }
        this.a = a;
        this.b = b;
    }
    
    public int resultado() {
        int c = a + b;
        if(c > 10) {
            throw new SumaException(
                    SumaException.A_MAS_B_MAYOR_10, "A + B no puede ser mayor a 10");
        }
        return c;
    }
}
