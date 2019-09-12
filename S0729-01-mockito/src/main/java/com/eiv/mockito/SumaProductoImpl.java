package com.eiv.mockito;

public class SumaProductoImpl {

    private ProductoImpl producto;
    
    public SumaProductoImpl() {
        producto = new ProductoImpl();
    }
    
    public int ejecutar(int a, int b, int c, int d) {
        int ab = producto.ejecutar(a, b);
        int cd = producto.ejecutar(c, d);
        
        int resultado = ab + cd;
        return resultado;
    }
}
