package com.eiv;

public class DummyB implements Dummy {

    @Override
    public String saludo(String mensaje) {
        return String.format("Wellcome ... %s", mensaje);
    }

}
