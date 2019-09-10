package com.eiv.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.eiv.DummyB;

@Configuration
public class AcmeCfg {

    @Bean("dummyB")
    public DummyB getDummy() {
        return new DummyB();
    }
}
