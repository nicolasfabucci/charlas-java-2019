package com.eiv;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParamCfg {

    @Bean
    public Param getParam() {
        return new Param();
    }
}
