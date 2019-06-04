package com.eiv;

import java.util.List;

public class App {

    private PrestamoDatasource datasource;
    
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
    
    public App() {
        datasource = new PrestamoDatasourceImpl();
    }
    
    public void run() {
        Long prestamoID = 1L;
        List<PrestamoCuota> prestamo = datasource.buscarPrestamo(prestamoID);
        
        prestamo.forEach(cuota -> System.out.println("Cuota: " + cuota));
        
        prestamo.stream()
            .filter(cuota -> 
                cuota.getPeriodo().getMes().equals((PrestamoCuota.Periodo.Mes.ABRIL)) && 
                cuota.getPeriodo().getAnio().equals(2019)
            )
            .findFirst()
            .ifPresent(cuota -> System.out.println("Cuota encontrada: " + cuota));
        
    }
}
