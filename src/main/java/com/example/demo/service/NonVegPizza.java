package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class NonVegPizza implements Pizza {

    String topping;

    NonVegPizza(){
        this.topping = "egg and chicken";
    }

    @Override
    public String getPizza(){
        return "VegPizza with "+topping ;
    }
}
