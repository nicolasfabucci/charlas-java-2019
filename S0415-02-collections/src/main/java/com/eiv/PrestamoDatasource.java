package com.eiv;

import java.util.List;

public interface PrestamoDatasource {

    public List<PrestamoCuota> buscarPrestamo(Long prestamoID);
}
