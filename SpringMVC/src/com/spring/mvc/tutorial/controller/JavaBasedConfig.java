package com.spring.mvc.tutorial.controller;

import com.spring.mvc.tutorial.service.JavaBasedConfigService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.spring.mvc.tutorial")
public class JavaBasedConfig {

    @Bean
    public JavaBasedConfigService getService(){
        return new JavaBasedConfigService();
    }
}
