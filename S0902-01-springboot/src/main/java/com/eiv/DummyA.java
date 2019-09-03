package com.eiv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DummyA implements Dummy {

    private static final Logger LOG = LoggerFactory.getLogger(DummyA.class);
    
    public String saludo(String mensaje) {
        LOG.info("Saludando ...");
        return String.format("Bienvenido... %s", mensaje);
    }
}
