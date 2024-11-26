package com.example.demo.controller;

import com.example.demo.service.CustomPizza;
import com.example.demo.service.Pizza;
import com.example.demo.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class PizzaController {

    Pizza pizza ;
    CustomPizza custPizza;


    @Autowired
    PizzaController(@Qualifier("nonVegPizza")Pizza pizza){
            this.pizza = pizza;
        }


    public String getPizza(){
        return pizza.getPizza();
    }


}
