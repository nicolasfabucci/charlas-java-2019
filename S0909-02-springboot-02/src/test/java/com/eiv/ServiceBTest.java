package com.eiv;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ServiceBTest {

    @TestConfiguration
    static class ServiceBCfg {
        
        @Bean
        public ServiceB getServiceB() {
            return new ServiceB();
        }
    }
    
    @Autowired ServiceB serviceB;
    
    @Test
    public void test() {
        
        int rv = serviceB.sumar(2, 2);
        assertThat(rv).isEqualTo(4);
    }
}
