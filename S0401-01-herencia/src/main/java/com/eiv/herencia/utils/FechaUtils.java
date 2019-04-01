package com.eiv.herencia.utils;

import java.time.LocalDate;

public class FechaUtils {

    public static int diasEntreFechas(LocalDate fecha1, LocalDate fecha2 ) {
            return fecha1.compareTo(fecha2);
    }   
}