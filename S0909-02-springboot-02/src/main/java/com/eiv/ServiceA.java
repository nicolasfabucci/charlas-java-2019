package com.eiv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceA {

    @Autowired private ServiceB serviceB;
    
    public int producto(int a, int b) {
        return serviceB.sumar(a, a) * serviceB.sumar(b, b);
    }
}
