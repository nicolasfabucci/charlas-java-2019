package com.eiv;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ServiceATest {

    @TestConfiguration
    static class ServiceBCfg {
        
        @Bean
        public ServiceA getServiceA() {
            return new ServiceA();
        }
    }
    
    @Autowired ServiceA serviceA;
    @MockBean private ServiceB serviceB;
    
    @Before
    public void setup() {
        Mockito.when(serviceB.sumar(Mockito.anyInt(), Mockito.anyInt())).thenReturn(1);
    }
    
    @Test
    public void test() {
        int rv = serviceA.producto(1, 1);
        assertThat(rv).isEqualTo(1);
    }
}
