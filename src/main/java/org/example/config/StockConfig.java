package org.example.config;

import org.example.serivce.Worker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class StockConfig {

    @Bean
    public Worker mishka() {
        return new Worker();
    }

    @Bean
    public Worker zelya() {
        return new Worker();
    }

}
