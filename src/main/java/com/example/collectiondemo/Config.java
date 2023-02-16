package com.example.collectiondemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Config {

    @Bean
    String one() {
        return "one";
    }

    @Bean
    List<String> two() {
        return List.of("two-1", "two-2");
    }

    @Bean
    String three() {
        return "three";
    }
}
