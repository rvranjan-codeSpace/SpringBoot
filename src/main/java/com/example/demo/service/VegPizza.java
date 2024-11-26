package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class VegPizza implements Pizza{

    String topping;

    VegPizza(){
        this.topping = "veg vanilla";
    }

    @Override
    public String getPizza(){
        return "VegPizza with "+topping ;
    }
}
