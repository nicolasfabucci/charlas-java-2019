package com.eiv.herencia.utils;

import java.time.Duration;
import java.time.LocalDate;

public class FechaUtils {

    public static long diasEntreFecha(LocalDate f1, LocalDate f2) {
        return Duration.between(f1.atStartOfDay(), f2.atStartOfDay()).toDays();
    }
}
