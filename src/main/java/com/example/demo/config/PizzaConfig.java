package com.example.demo.config;

import com.example.demo.controller.PizzaController;
import com.example.demo.service.CustomPizza;
import com.example.demo.service.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {

    @Bean
    Pizza getCustomPizza(){
        return new CustomPizza("marnated Custom Pizza", "soya sauce");
    }
}
